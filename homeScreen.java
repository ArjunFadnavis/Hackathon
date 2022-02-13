package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.ListView;
class homeScreen extends Form implements HandlesEventDispatching {
  private Button Button3;
  private Image Image1;
  private ListView ListView1;
  private Button Button1;
  private Button Button2;
  protected void $define() {
    this.AppName("hackathon");
    this.Title("homeScreen");
    Button3 = new Button(this);
    Button3.Text("Back");
    Button3.Visible(false);
    Image1 = new Image(this);
    Image1.Height(100);
    Image1.Width(170);
    Image1.Picture("ScreenShot2022-02-12at5.29.44PM.png");
    ListView1 = new ListView(this);
    ListView1.Visible(false);
    Button1 = new Button(this);
    Button1.Text("Play");
    Button2 = new Button(this);
    Button2.Text("How to play");
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    return false;
  }
}