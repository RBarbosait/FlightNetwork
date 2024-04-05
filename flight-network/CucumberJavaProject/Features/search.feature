@tag
Feature: Search for a flight
  I want to use this template for my feature file

  @tag1
  Scenario: Search for a Athenas - Montevideo flight
    Given I open google chrome browser and go to flightnetwork URL
    When I input from Athenas to Montevideo
    And click search
    Then I validate the outcomes results
    
  @tag2
  Scenario: Athenas - Montevideo flight filtered by company
    Given I search for a flight Athenas - Montevido
    When I choose AirCompany filter
    Then I validate the outcomes results - flights ui display=flights from api
    
#       @tag3
#  Scenario: Athenas - Montevideo flight filtered by stops
#    Given I open google chrome browser and go to flightnetwork URL
#    When I input from Athenas to Montevideo and search
#    And I choose Stops n bfilter
#    Then I validate the outcomes results - flights ui display=flights from api
    

# @tag2
#  Scenario Outline: Title of your scenario outline
#    Given I want to write a step with <name>
#    When I check for the <value> in step
#    Then I verify the <status> in step

 #   Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
