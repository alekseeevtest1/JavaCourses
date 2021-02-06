package lesons10;

public class Task {
    /**
     * Заменить все грустные смайлы на веселые
     */
    public static void main(String[] args) {
        String str = " (:   !gfgfggfdgfgfdgf):dgfdg ): ):";

       char[] a = str.toCharArray();
        System.out.println();
        for (int i = 0; i < a.length - 1;i++){
            if (a[i] == ')' || a[i + 1] == ':'){
                a[i] = '(';
            }
            System.out.println(a[i]);
        }
        str = String.copyValueOf(a);
        System.out.println(str);

    }
}
