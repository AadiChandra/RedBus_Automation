@filterByPrice
Feature: Filters applied

Scenario: confirmatio 
Given User is viewing all buses
When user apply AC filter
And user also select Free Cancelation
And user also selects sleeper filter
Then user sees all the available buses under these filters
When user sort by price
Then user gets buses in sorted price