package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.TinyDB;
class newUserScreen extends Form implements HandlesEventDispatching {
  private Image Image1;
  private Label Label2;
  private TextBox TextBox1;
  private Button Button1;
  private TinyDB TinyDB1;
  protected void $define() {
    this.AppName("hackathon");
    this.Title("newUserScreen");
    Image1 = new Image(this);
    Image1.Height(100);
    Image1.Width(170);
    Image1.Picture("ScreenShot2022-02-12at5.29.44PM.png");
    Label2 = new Label(this);
    Label2.Text("How much money would you like to save this game?");
    TextBox1 = new TextBox(this);
    TextBox1.Hint("Hint for TextBox1");
    Button1 = new Button(this);
    Button1.BackgroundColor(0xFFCCCCCC);
    Button1.FontBold(true);
    Button1.Text("Go!");
    Button1.TextColor(0xFF000000);
    TinyDB1 = new TinyDB(this);
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}