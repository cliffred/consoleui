package de.codeshelf.consoleui.prompt;

/**
 *
 * User: Andreas Wegmann
 * Date: 03.02.16
 */
public class InputResult implements PromtResultItemIF {
  private String input;

  public InputResult(String input) {
    this.input = input;
  }

  public String getInput() {
    return input;
  }

  @Override
  public String toString() {
    return "InputResult{" +
            "input='" + input + '\'' +
            '}';
  }
}
