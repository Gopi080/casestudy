Feature: TestMeApp

Scenario Outline: Login functionality
Given opens TestMeApp 
And sign in
And enter "<username>"
Then enters "<password>"
When validates login
Then search"<product>"
Then click search
Then signoff
Examples:
|  username  |  password  | product    |
|  lalitha   | password123| headphones |
|  gopu      |  passwd    | pillow     |