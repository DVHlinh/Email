public class Main {
    public static void main(String[] args) {
        try {
//            int a =0;
//            if(a==0){
//                throw new MyExcreptionone();
//
//            }
            ThuTrongtuan th = ThuTrongtuan.Thu2;
            th.setMa(1);
            th.setTienganh(123);
            th.setTiengviet(12);
            System.out.println(th.getMa());
        }catch (Exception s){
            System.out.println("myExcreption");
        }
    }
}
