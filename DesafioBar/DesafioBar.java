/*Em um bar, o ingresso custa 10 reais para homens e 8 reais para mulheres. Cada cerveja custa 5
reais, cada refrigerante 3 reais e cada espetinho custa 7. Além disso, o bar cobra uma taxa de
couvert artístico no valor de 4 reais, porém, se o valor gasto com consumo for superior a 30 reais,
o couvert artístico não é cobrado. Fazer um programa para ler os seguintes dados de um cliente do
bar: sexo (F ou M), quantidade de cervejas, refrigerantes e espetinhos consumidos. O programa
deve então mostrar um relatório com a conta a ser paga pelo cliente.*/
import java.util.Locale;
import java.util.Scanner;
class DesafioBar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int qtCerveja, qtRefrigerante, qtEspetinho;
        char sexo;
        double ingresso=0.0, couvert=4.0;
        double precoCerveja=5, precoRefri=3, precoEspeto=7;


        System.out.print("Sexo: ");
        sexo = sc.next().charAt(0);
        System.out.print("Quantidade de cervejas: ");
        qtCerveja=sc.nextInt();
        System.out.print("Quantidade de refrigerantes: ");
        qtRefrigerante=sc.nextInt();
        System.out.print("Quantidade de espetinhos: ");
        qtEspetinho=sc.nextInt();

        if(sexo=='f' || sexo=='F'){
            ingresso=8;
        }else if(sexo=='m' || sexo=='M'){
            ingresso=10;
        }
        double consumo=(precoCerveja*qtCerveja)+(precoRefri*qtRefrigerante)+(precoEspeto*qtEspetinho);

        if(consumo>30){
            couvert=0;
            double total=consumo+ingresso+couvert;
            System.out.println("RELATÓRIO:");
            System.out.printf("Consumo = R$ %.2f\n", consumo);
            System.out.println("Isento de Couvert");
            System.out.printf("Ingresso = R$ %.2f\n", ingresso);
            System.out.printf("Valor a pagar = R$ %.2f\n", total);
        }else{
            double total=consumo+ingresso+couvert;
            System.out.println("RELATÓRIO:");
            System.out.printf("Consumo = R$ %.2f\n", consumo);
            System.out.printf("Couvert = R$ %.2f\n", couvert);
            System.out.printf("Ingresso = R$ %.2f\n", ingresso);
            System.out.printf("Valor a pagar = R$ %.2f\n", total);
        }
        sc.close();
    }
}
