import org.sikuli.script.*;

public class Sikuli {
    public static void main(String[] args) {
        Screen s = new Screen();

        String imagePath = "F:\\images"; // path to image folder
        ImagePath.add(imagePath);

        String iconImage = "eclipse_icon.png";
        String pkgImage = "package_icon.png";
        String dialogImage = "dialog_box_icon.png";
        String nextImage = "next_icon.png";

        String dbDialogBox = "db_dialog_box.png";
        String notepadImage = "notepad_icon.png";
        String publishImage = "publish_icon.png";

        String cdsImage = "cds_folder.png";
        String businessImage = "business_folder.png";

        try {

            // Creation of DATA MODEL

            s.click(iconImage);

            s.rightClick(pkgImage);
            s.type(Key.DOWN);
            s.type(Key.ENTER);
            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);

            }
            s.type(Key.ENTER);

            s.wait(dialogImage);

            for (int i = 0; i < 10; i++) {
                s.type(Key.DOWN);

            }

            s.type(Key.ENTER);

            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);
            }

            s.click(nextImage);
            s.wait(1.5);

            s.type("Z_R_MARA_ITEMS");
            s.type(Key.ENTER);
            s.type(Key.TAB);
            s.type("MARA ITEMS DATA MODEL");

            s.wait(1.0);
            s.type(Key.ENTER);
            s.type(Key.ENTER);
            s.wait(3.0);
            s.type(Key.ENTER);
            s.wait(3.0);

            // Code copy & paste
            s.click(notepadImage);
            s.wait(0.5);
            s.type("a", Key.CTRL);
            s.type("c", Key.CTRL);
            s.click(iconImage);
            s.wait(0.5);
            s.type("a", Key.CTRL);
            s.type("v", Key.CTRL);
            s.type(Key.F3, Key.CTRL);
            s.wait(5.0);

            // Creation of HEAD DATA MODEL

            s.rightClick(pkgImage);
            s.type(Key.DOWN);
            s.type(Key.ENTER);
            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);

            }
            s.type(Key.ENTER);

            s.wait(dialogImage);

            for (int i = 0; i < 10; i++) {
                s.type(Key.DOWN);

            }

            s.type(Key.ENTER);

            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);
            }

            s.click(nextImage);
            s.wait(1.5);

            s.type("Z_R_MARA_MODEL");
            s.type(Key.ENTER);
            s.type(Key.TAB);
            s.type("MARA Data Model");

            s.wait(1.0);
            s.type(Key.ENTER);
            s.type(Key.ENTER);
            s.wait(3.0);
            s.type(Key.ENTER);
            s.wait(3.0);

            // Code copy & paste
            s.click(notepadImage);
            s.wait(0.5);
            s.type(Key.TAB, Key.CTRL);
            s.type("a", Key.CTRL);
            s.type("c", Key.CTRL);
            s.click(iconImage);
            s.wait(0.5);
            s.type("a", Key.CTRL);
            s.type("v", Key.CTRL);
            s.type(Key.F3, Key.CTRL);
            s.wait(5.0);

            // CREATION OF PROJECTION VIEWS

            s.rightClick(pkgImage);
            s.type(Key.DOWN);
            s.type(Key.ENTER);
            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);

            }
            s.type(Key.ENTER);

            s.wait(dialogImage);

            for (int i = 0; i < 10; i++) {
                s.type(Key.DOWN);

            }

            s.type(Key.ENTER);

            for (int i = 0; i < 3; i++) {
                s.type(Key.DOWN);
            }

            s.click(nextImage);
            s.wait(1.5);

            s.type("ZPR_VIEWMARA");
            s.type(Key.ENTER);
            s.type(Key.TAB);
            s.type("MARA Projection View");

            s.wait(1.0);
            s.type(Key.ENTER);
            s.type(Key.ENTER);
            s.wait(3.0);
            s.type(Key.ENTER);
            s.wait(3.0);

            // Code copy & paste
            s.click(notepadImage);
            s.wait(0.5);
            s.type(Key.TAB, Key.CTRL);
            s.type("a", Key.CTRL);
            s.type("c", Key.CTRL);
            s.click(iconImage);
            s.wait(0.5);
            s.type("a", Key.CTRL);
            s.type("v", Key.CTRL);
            s.type(Key.F3, Key.CTRL);
            s.wait(5.0);

            // Service Definition

            s.click(cdsImage);
            s.type(Key.ENTER);
            s.wait(0.5);
            s.type(Key.DOWN);
            s.type(Key.ENTER);
            s.wait(0.5);
            s.type(Key.DOWN);
            s.type(Key.F10, Key.SHIFT);
            for (int i = 0; i < 4; i++) {
                s.type(Key.DOWN);
            }
            s.type(Key.ENTER);
            s.wait(1.5);
            s.type("ZR_SERVDEMO");
            s.type(Key.ENTER);
            s.type(Key.TAB);
            s.type("MM Report Service Definition");

            s.wait(1.0);
            s.type(Key.ENTER);
            s.type(Key.ENTER);
            s.wait(3.0);
            s.type(Key.ENTER);
            s.wait(3.0);

            // Code copy & paste
            s.click(notepadImage);
            s.wait(0.5);
            s.type(Key.TAB, Key.CTRL);
            s.type("a", Key.CTRL);
            s.type("c", Key.CTRL);
            s.click(iconImage);
            s.wait(0.5);
            s.type("a", Key.CTRL);
            s.type("v", Key.CTRL);
            s.type(Key.F3, Key.CTRL);
            s.wait(5.0);

            // Service Binding

            s.click(businessImage);
            s.type(Key.ENTER);
            s.wait(0.5);
            s.type(Key.DOWN);
            s.type(Key.DOWN);
            s.type(Key.ENTER);
            s.wait(0.5);

            s.type(Key.DOWN);
            s.type(Key.F10, Key.SHIFT);
            for (int i = 0; i < 2; i++) {
                s.type(Key.DOWN);
            }
            s.type(Key.ENTER);
            s.wait(1.5);
            s.type("ZR_SERV_BDEMO");
            s.type(Key.ENTER);
            s.type(Key.TAB);
            s.type("PO Report Service Binding");
            s.type(Key.ENTER);
            for (int i = 0; i < 2; i++) {
                s.type(Key.TAB);
            }
            for (int i = 0; i < 2; i++) {
                s.type(Key.DOWN);
            }
            s.type(Key.ENTER);
            s.wait(3.5);
            s.type(Key.ENTER);
            s.wait(4.0);
            s.type(Key.F3, Key.CTRL);
            s.wait(6.0);
            s.click(publishImage);

        } catch (FindFailed e) {
            e.printStackTrace();
        }
    }
}
