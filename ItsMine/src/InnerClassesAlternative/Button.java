package InnerClassesAlternative;


public class Button implements CodeLogicDepot {

	private String title;
	private CodeLogicDepot logicOnClick;

	@Override
	public void registerNewCodeLogic(String codeLogicDescription) {
		System.out.println("Whenever button " + title + " is clicked" + codeLogicDescription + " will be executed!");
	}

	@Override
	public void execute() {
		System.out.println("All logic inside the CodeLogicDepot of button " + title + " is now being executed!");
	}

	public void click() {
		this.execute();
	}

	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public CodeLogicDepot getLogicOnClick() {
		return logicOnClick;
	}

	public void setLogicOnClick(CodeLogicDepot logicOnClick) {
		this.logicOnClick = logicOnClick;
	}

}
