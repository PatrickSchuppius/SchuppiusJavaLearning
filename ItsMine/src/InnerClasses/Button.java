package InnerClasses;


public class Button {

	private String title;
	private OnClickListener onClicklister;

	public Button(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	// public void setTitle(String title) {
	// this.title = title;
	// }

	// public OnClickListener getOnClicklister() {
	// return onClicklister;
	// }

	public void setOnClickListener(OnClickListener OnClickListener) {
		this.onClicklister = OnClickListener;
	}

	public void onButtonClick() {
		this.onClicklister.onClick(this.title);
	}

	public interface OnClickListener {
		public void onClick(String title);
	}

}
