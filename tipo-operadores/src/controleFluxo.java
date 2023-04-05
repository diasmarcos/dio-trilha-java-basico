public class controleFluxo {
    public static void main(String[] args) {
       int mes = 13;
       String nomeMes = "";
       
      
    if (mes==1) {
            nomeMes = "Janeiro";
       }else{
            if (mes==2) {
                nomeMes = "Fevereitro";
            }else{
                if (mes==3) {
                    nomeMes = "Marco"; 
                } else {
                    if (mes==4) {
                        nomeMes = "Abriu";
                    } else {
                        if (mes==5) {
                            nomeMes = "Maio";
                        } else {
                            if (mes==6) {
                                nomeMes = "Junho";
                            } else {
                                if (mes==7) {
                                    nomeMes = "Julho";
                                } else {
                                    if (mes==8) {
                                        nomeMes = "Agosto";
                                    } else {
                                        if (mes==9) {
                                    nomeMes = "Setembro";
                                    }  else {
                                        if (mes==10) {
                                            nomeMes = "Outubro";
                                        } else {
                                            if (mes==11) {
                                                nomeMes = "Novembro";
                                            }  else {
                                                if (mes==12) {
                                                    nomeMes = "Dezembro";
                                                } else{
                                                    nomeMes = "Digite o mês correto!";
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    } 
    System.out.println(nomeMes);

    if ((nomeMes =="Janeiro") || (nomeMes =="Junho") || (nomeMes =="Dezembro") ) {
        

        System.out.println("Estamos de férias!!!");
    }
    String diaSemana = "Quarta";
int menssagem = 0;
    switch (diaSemana) {
        case "Domingo": menssagem=1;
            break;
        case "Segunda": menssagem=2;
            break;
        case "Terca": menssagem=3;
            break;
        case "Quarta": menssagem=4;
            break;
        case "Quinta": menssagem=5;
            break;
        case "Sexta": menssagem=6;
            break;
        case "Sabado": menssagem=7;
            break;
        default: menssagem=0;
            break;
    }
    int dia =menssagem;
    System.out.println(menssagem);
    if((dia <= 3) && (dia > 0)){
        System.out.println("Certo");
    }else{
        if (dia==4) {
            System.out.println("Errado");
        } else{
            if(dia==5){
                System.out.println("Talvez");
            }else{
                System.out.println("indefinido");
            }
        }

    }

    }
    
}
