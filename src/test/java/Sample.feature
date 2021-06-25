Feature: Add
  Test add
  @simpleDemo
  Scenario Outline: Add
    Given add <arg0> to <arg1>
    When I ask the answer of add
    Then I get <answer>
    Examples:
      | arg0 | arg1 | answer |
      | 1    | 1    | 2      |

  Scenario Outline: Add1
    Given add <arg0> to <arg1>
    When I ask the answer of add
    Then I get <answer>
    Examples:
      | arg0 | arg1 | answer |
      | 2    | 1    | 3      |
