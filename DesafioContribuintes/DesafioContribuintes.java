import java.util.Locale;
import java.util.Scanner;
class DesafioContribuintes{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salarioAnual, servico, capital;
        double gMedico, gEducacionais;

        System.out.println("Digite os dados do contribuinte:");
        System.out.print("Renda anual com salário: ");
        salarioAnual=sc.nextDouble();
        System.out.print("Renda anual com prestação de serviço: ");
        servico = sc.nextDouble();
        System.out.print("Renda anual com ganho de capital: ");
        capital = sc.nextDouble();
        System.out.print("Gastos médicos: ");
        gMedico = sc.nextDouble();
        System.out.print("Gastos educacionais: ");
        gEducacionais = sc.nextDouble();


        System.out.println("RELATÓRIO:");
        System.out.printf("Imposto sobre salário: %.2f\n", impostoSobreSalario(salarioAnual));
        System.out.printf("Imposto sobre serviços: %.2f\n", impostoSobreServicos(servico));
        System.out.printf("Imposto sobre ganho de capital: %.2f\n", impostoSobreGC(capital));
        System.out.printf("Imposto bruto total: %.2f\n", impostoBrutoTotal(salarioAnual, servico, capital));
        System.out.printf("Abatimento: %.2f\n", abatimento(salarioAnual, servico, capital, gMedico, gEducacionais));
        System.out.printf("Imposto devido: %.2f\n", impostoBrutoTotal(salarioAnual, servico, capital) - abatimento(salarioAnual, servico, capital, gMedico, gEducacionais));

        sc.close();
    }

    public static double impostoSobreSalario(double quantia){
        double impostoRenda;
        double salarioMensal = quantia/12.0;
        if(salarioMensal<3000){
            impostoRenda=0;
        }else if(salarioMensal<5000){
             impostoRenda = quantia*0.1;
        }else{
            impostoRenda = quantia*0.2;
        }

        return impostoRenda;
    }

    public static double impostoSobreServicos(double quantia){
        return quantia * 0.15;
    }

    public static double impostoSobreGC(double quantia){
        return quantia*0.2;
    }

    public static double impostoBrutoTotal(double salario, double servico, double capital){
        return impostoSobreSalario(salario) + impostoSobreServicos(servico) + impostoSobreGC(capital);
    }
    public static double gastosTotais(double gastosMedicos, double gastosEducacionais){
        return gastosMedicos+gastosEducacionais;
    }


    public static double abatimento(double salario, double servico, double capital, double gastosMedicos, double gastosEducacionais){
        if(gastosTotais(gastosMedicos, gastosEducacionais)>=(0.3*impostoBrutoTotal(salario, servico,capital))){
            return impostoBrutoTotal(salario, servico, capital)*0.3;
        }else{
            return gastosTotais( gastosMedicos, gastosEducacionais);
        }
    }

}


