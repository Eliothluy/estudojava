import java.util.Locale;
import java.util.Scanner;
class DesafioAtletas{
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de atletas?");
        int n = sc.nextInt();
        String nome[] = new String[n];
        char sexo[] = new char[n];
        double altura[] = new double[n];
        double peso[] = new double[n];
        double maiorAltura;
        double somaPeso = 0;
        int homens = 0;
        int mulheres = 0;
        int posicaoAltura=0;
        double somaMulheres=0;
        for(int i = 0; i<n; i++){
            System.out.printf("Digite os dados do atleta numero %d:\n", i+1);
            System.out.print("Nome: ");
            sc.next();
            nome[i] = sc.next();
            System.out.print("Sexo: ");
            sexo[i] = sc.next().charAt(0);
            while(sexo[i]!= 'M' && sexo[i]!='F'){
                System.out.println("Valor invalido! Favor digitar F ou M:");
                sexo[i] = sc.next().charAt(0);
            }
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
            while(altura[i]<=0){
                System.out.println("Valor invalido! Favor digitar um valor positivo:");
                altura[i] = sc.nextDouble();
            }
            System.out.print("Peso: ");
            peso[i] = sc.nextDouble();
            while(peso[i]<=0){
                System.out.println("Valor invalido! Favor digitar um valor positivo:");
                peso[i] = sc.nextDouble();
            }
        }

        for(int i = 0; i<n; i++){
            somaPeso = somaPeso + peso[i];
            maiorAltura=altura[0];

            if(maiorAltura>altura[i]){
                maiorAltura = altura[i];
                posicaoAltura=i;
            }
            if(sexo[i]=='M'){
                homens++;
            }else{
                mulheres++;
                somaMulheres=somaMulheres+altura[i];
            }
        }

        double pesoMedio = somaPeso/(double)n;
        double mediaAltura = somaPeso/(double)n;
        double percentagem = (homens*100)/(double)n;
        double alturaMediaMulheres = somaMulheres/(double)mulheres;

        if(mulheres!=0){
            System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.printf("Atleta mais alto: %s\n", nome[posicaoAltura]);
        System.out.printf("Porcentagem de homens: %.2f %%\n", percentagem);
        System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
        }else{
            System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedio);
        System.out.printf("Atleta mais alto: %s\n", nome[posicaoAltura]);
        System.out.printf("Porcentagem de homens: %.2f %%\n", percentagem);
        System.out.println("Não há mulheres cadastradas");
        }



        sc.close();
    }
}
