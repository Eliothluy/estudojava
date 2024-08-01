import java.util.Scanner;
class DesafioImposto{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double rendaAnual, prestacaoServico, ganhoCapital, gastosMedicos, gastosEducacionais;


        System.out.println("Renda anual com salário: ");
        rendaAnual = sc.nextDouble();

        System.out.println("Renda anual com prestação de serviço:");
        prestacaoServico = sc.nextDouble();

        System.out.println("Renda anual com ganho de capital:");
        ganhoCapital = sc.nextDouble();

        System.out.println("Gastos médicos:");
        gastosMedicos = sc.nextDouble();

        System.out.println("Gastos educacionais:");
        gastosEducacionais = sc.nextDouble();

        double rendaMensal = rendaAnual/12;
        double imposto;
        double gastos = gastosMedicos + gastosEducacionais;
        if(rendaMensal<3000){
            imposto=0;
        }else if(rendaMensal>=3000 && rendaMensal<5000){
            imposto=rendaAnual*0.1;
        }else{
            imposto=rendaAnual*0.2;
        }

        double impostoPrestacao = prestacaoServico*0.15;

        double impostoCapital = ganhoCapital * 0.2;

        double impostoTotal = impostoPrestacao+impostoCapital+imposto;

        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA");
        System.out.println();
        System.out.println("CONSOLIDADO DE RENDA:");
        System.out.printf("Imposto sobre salário: %.2f\n", imposto);
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoPrestacao);
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoCapital);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.printf("Máximo dedutível: %.2f\n", impostoTotal*0.3);
        System.out.printf("Gastos dedutíveis: %.2f\n", gastos);
        System.out.println();
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: %.2f\n", impostoTotal);
        if(gastos<0.3*impostoTotal){
            System.out.printf("Abatimento: %.2f\n", gastos);
            System.out.printf("Imposto devido: %.2f\n", impostoTotal-gastos);
        }else{
            System.out.printf("Abatimento: %.2f\n", impostoTotal*0.3);
            System.out.printf("Imposto devido: %.2f\n", impostoTotal-(impostoTotal*0.3));
        }


        sc.close();
    }
}
