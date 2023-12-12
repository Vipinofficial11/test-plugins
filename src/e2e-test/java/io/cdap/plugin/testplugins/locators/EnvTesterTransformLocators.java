/*
 * Copyright © 2023 Cask Data, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.cdap.plugin.testplugins.locators;

import io.cdap.e2e.utils.SeleniumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/**
 * EnvTesterTransform Related Locators.
 */
public class EnvTesterTransformLocators {
  public static WebElement envVariablesInputBox(int row) {
    return SeleniumDriver.getDriver().findElement(By.xpath(
            "//div[@data-cy='envVars']//div[@data-cy='" + row + "']//input"));
  }

  public static WebElement configureRunTimeArgs() {
    return SeleniumDriver.getDriver().findElement(By.xpath("//div[@data-testid='arrow-btn-container']//div"));
  }

  public static WebElement save() {
    return SeleniumDriver.getDriver().findElement(By.xpath("//button[@data-cy='save-runtime-args-btn']"));
  }

  public static WebElement runTimeArgumentsKeyInputBox() {
    String xpath = "//div[@data-cy='runtimeargs-deployed']//*[@data-cy= '0']//div[@data-cy='runtimeargs-key']"
      + "//input";
    return SeleniumDriver.getDriver().findElement(By.xpath(xpath));
  }
  public static WebElement runTimeArgumentsValueInputBox() {
    String xpath = "//div[@data-cy='runtimeargs-deployed']//*[@data-cy= '0']//div[@data-cy='runtimeargs-value']" +
      "//textarea[@rows='1']";
    return SeleniumDriver.getDriver().findElement(By.xpath(xpath));
  }

  public static WebElement clickEnvVarsAddRowButton(int row) {
    String xpath = "//div[@data-cy='envVars']//div[@data-cy='" + row + "']//button[@data-cy='add-row']";
    return SeleniumDriver.getDriver().findElement(By.xpath(xpath));
  }
}
