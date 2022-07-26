Feature:Home page related scenarios

  @ADVSYS-6 @smoke
  Scenario Outline: Verify following link is displayed
    Then Verify "<linkText>" link is displayed
    Examples:
      | linkText   |
      | Get Support|
      | Job Career |
      | Feedbacks  |

  @ADVSYS-6 @smoke
  Scenario Outline: Verify Language section user click dropdown and able to see English, Spanish, French
    When user can click dropdown for change language
    Then Verify "<linkText>" link is enabled
    Examples:
      | linkText  |
      | English   |
      | Spanish   |
      | French    |

  @ADVSYS-9
  Scenario Outline:ADVSYS-9. Verify Page Navigation Bar has following links displayed
    Then Verify "<linkText>" link is displayed
    Examples:
      | linkText   |
      | Home       |
      | About Us   |
      | Services   |
      | Clients    |
      | Solutions  |
      | Join Us    |
      | Contact Us |

  @ADVSYS-9
  Scenario Outline:ADVSYS-9.Verify Page Navigation Bar links take to corresponding pages by verifying title
    When User clicks on "<link>"
    And User switches to the next window
    Then Verify title of the page is "<title>"
    Examples:
      | link       | title                        |
      | Home       | Advance Systems - Home       |
      | About Us   | Advance Systems - About Us   |
      | Services   | Advance Systems - Services   |
      | Clients    | Advance Systems - Clients    |
      | Solutions  | Advance Systems - Join       |
      | Join Us    | Advance Systems - Join       |
      | Contact Us | Advance Systems - Contact Us |

  @ADVSYS-12
  Scenario Outline: Verify 5 section displayed as a headers and descriptions under it.
    When User see headers as "<headerH3>"
    Then Verify "<description>" is displayed under header
    Examples:
      | headerH3                      | description |
      | Leadership Development      |  Lorem Ipsum is simply dummy text of the printing and typesetting industry.             |
      | Capability Building         |  Lorem Ipsum is simply dummy text of the printing and typesetting industry.            |
      | Reward & Benefits           |  Lorem Ipsum is simply dummy text of the printing and typesetting industry.              |
      | Employee & Industrial       |  Lorem Ipsum is simply dummy text of the printing and typesetting industry.              |
      | Delivering Excellent        |  Lorem Ipsum is simply dummy text of the printing and typesetting industry.              |

  @ADVSYS-15
  Scenario Outline: Following information should be displayed in footer section:
    When User scrolls down page to footer information
    Then Verify footer "<information>" is displayed
    Examples:
    |    information                                |
    |    Address: 10090 Main St, Fairfax, VA        |
    |    Phone: +1 703-831-3217                     |
    |    Email: Info@advancesystems.us              |
    |    Mon to Sat: 9.00 am to 5:00 pm             |


