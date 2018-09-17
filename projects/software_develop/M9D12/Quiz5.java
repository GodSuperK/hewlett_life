package M9D12;

import java.util.Scanner;
import java.util.Arrays;

/**
 * 使用switch实现菜单跳转
 *
 * @author 孔德成
 * @version 1.0
 */
class Quiz5 extends Quiz{

    private static Scanner in = new Scanner(System.in);

    void show() {
        System.out.println("现在运行的是实验5--------");
        boolean isLogin = Quiz5.login();
        Quiz5.goToMenu(isLogin);
    }

    private static void goToMenu(boolean isLogin) {

        if (isLogin) {
            String menu = "1. 读者信息管理\n2. 图书信息管理\n3. 借阅管理\n4. 注销";
            System.out.println(menu);
            while (isLogin) {
                System.out.println("请输入指令: ");
                int go = in.nextInt();
                switch (go) {
                    case 1:
                        System.out.println("读者信息管理");
                        break;
                    case 2:
                        System.out.println("图书信息管理");
                        break;
                    case 3:
                        System.out.println("借阅管理");
                        break;
                    case 4:
                        System.out.println("注销");
                        System.out.println("注销成功, 返回登陆菜单");
                        isLogin = false;
                        break;
                    default:
                        System.out.println("指令无效，请重新输入指令!");
                }

            }
        }
    }

    private static boolean login() {
        /* 登陆验证 */
        String menu = "1. 登陆系统\n2. 退出系统";
        System.out.println(menu);
        System.out.println("请输入指令");
        int go = in.nextInt();
        // 从登陆菜单进入主菜单
        switch (go) {
            case 1:
                System.out.println("登陆系统成功");
                return true;
            case 2:
                System.out.println("退出系统成功");
                System.out.println("实验5展示完成--------");
                return false;
            default:
                return false;
        }
    }
}





