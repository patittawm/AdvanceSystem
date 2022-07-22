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

  @ADVSYS-12 @smoke
  Scenario Outline: Verify with 5 items section displayed as a headers and descriptions under it.
    Then Verify "<Header>" headers is displayed
    Examples:
      | Header                      |
      | Leadership Development      |
      | Capability Building         |
      | Reward & Benefits           |
      | Employee & Industrial       |
      | Delivering Excellent        |
