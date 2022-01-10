package Pages;

import org.openqa.selenium.WebElement;

public class Checkbox {
	private final WebElement element;
	public Checkbox(WebElement element) {
		this.element=element;
	}
	public boolean isChecked() {
		return element.isSelected();
	}
	public void toggle() {
		element.click();
	}

}
