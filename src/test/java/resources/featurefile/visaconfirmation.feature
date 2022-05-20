Feature: Visa confirmation Test

  Scenario: An Australian would like to visit Uk on Turiest visa
    Given I am on Homepage of Homeoffice website
    When  I click on start button
    And   I select Nationality "Australia" from the country option
    And   I click on continue button
    And   I select "tourism" as reason to travel
    And   I click on continue button
    Then  I can see "You will not need a visa to come to the UK" on the screen

@Test
  Scenario: A chilean Coming To the UK for Working and Plans on staying for longer than six months
    Given I am on Homepage of Homeoffice website
    When  I click on start button
    And   I select Nationality "Chile" from the country option
    And   I click on continue button
    And   I select "academic" as reason to work
    And   I click on continue button
    And   I select intend to stay for "longer than 6 months" on the planing to work page
    And   I click on continue button on duration of stay
    Then I select job type "Health and care professional" on work type page
    And I click on next step on work type page
    Then  I can see "You need a visa to work in health and care" message on the screen

  Scenario: A Columbian Natinal Coming To the Uk to Join A Partner for A Long saty they do have An Article 10 or 20 card
    Given I am on Homepage of Homeoffice website
    When  I click on start button
    And   I select Nationality "Colombia" from the country option
    And   I click on continue button
    And   I select "Join partner or family for a long stay" as reason to stay
    And   I click on continue button
    And   I select my partner or family member have uk immigration status yes on family immigration page
    And   I click on continue button on family immigration page
    Then  I can see "You’ll need a visa to join your family or partner in the UK" on the screen

