package introduction;

public class Aula06_pt02EstruturasCondicionais {
    public static void main(String[] args) {
        //idade < 15 categoria infantil;
        //idade >=15 && < 18 categoria adulta;
        //idade >=18 categoria aulto;

        int idade = 17;
        String categoria = "";

        if(idade < 15) {
            categoria = "Categoria Infantil";
        } else if(idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulta";
        }

        System.out.println(categoria);





    }
}
