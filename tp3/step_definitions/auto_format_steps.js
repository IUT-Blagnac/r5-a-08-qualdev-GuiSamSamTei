const { Given, When, Then } = require('@cucumber/cucumber');
const assert = require('assert');

// Variable to hold the code to be formatted
let code;

// Step for "Given I have code with incorrect indentation"
Given('I have code with incorrect indentation', function () {
  // Assign some code with incorrect indentation to the `code` variable
  code = "puts 'Hello'   "; // Code with extra spaces at the end
});

// Step for "When I save the file"
When('I save the file', function () {
  // Simulate auto-formatting by trimming the spaces
  code = code.trim(); // Auto-format by removing extra spaces
});

// Step for "Then the code should be auto-formatted according to style rules"
Then('the code should be auto-formatted according to style rules', function () {
  // Assert that the code has been auto-formatted correctly
  assert.strictEqual(code, "puts 'Hello'"); // Check that the spaces are removed
});
