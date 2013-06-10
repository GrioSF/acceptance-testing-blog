Feature:
As an anonymous user
I want to do search on Amazon's homepage
So that I can find books about clean coding

  Scenario: Searches for a specific book and sees results
    Given an anonymous user
    When I go to Amazon Home Page
    And I search for "The Clean Coder"
    Then the products results page displays a list of results containing product
      """
      The Clean Coder: A Code of Conduct for Professional Programmers
      """

  Scenario: Searches for a specific book and sees results
    Given an anonymous user
    When I go to Amazon Home Page
    And I search for "Bob Martin"
    Then the products results page displays a list of results containing product
    """
    The Clean Coder: A Code of Conduct for Professional Programmers
    """
