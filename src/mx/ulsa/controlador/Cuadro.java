package mx.ulsa.controlador;

public class Cuadro {
    Integer n;
    Integer[][] matriz;
    
    public Cuadro(Integer n, Integer[][] matriz){
        this.n = n;
        this.matriz = matriz;
    }
    
    public ResultadoMatriz isMagico(){//0 = correcto, 1 = sumas no coinciden, 2 ingreso los mismos valores 
        if(this.evaluarSumas()== ResultadoMatriz.sumasCorrectas && this.evaluarNumeros()==ResultadoMatriz.valoresCorrectos)
            return ResultadoMatriz.valido;
        else if(this.evaluarNumeros()== ResultadoMatriz.valoresNoValidos)
                return ResultadoMatriz.valoresNoValidos;
        else if(this.evaluarNumeros() == ResultadoMatriz.valoresRepetidos)
                return ResultadoMatriz.valoresRepetidos;
        else if(this.evaluarSumas() == ResultadoMatriz.sumasDesiguales)
                return ResultadoMatriz.sumasDesiguales;
        else
            return ResultadoMatriz.matrizCero;
    }
    
    public ResultadoMatriz evaluarSumas(){
        ResultadoMatriz resultado = null;
        Integer[] suma = new Integer[2*n+2];
        //evauar las sumas horizontales
        int coef = 0;
        for(int i=0;i<n; i++){//filas, 0,1
            suma[coef] = 0;
            
            for(int j=0; j<n; j++){//x
                //evaluar las sumas de las filas
                System.out.println(matriz[j][i]);
                suma[coef]+= matriz[j][i];//dfdfdfd
            }
            
            coef++;
        }
        //evaluar las sumas verticales
        for(int i=0;i<n; i++){//columnas, x 
            suma[coef]=0;
            for(int j=0; j<n; j++){//filas, y
                //evaluar las sumas de las filas
                suma[coef]+= matriz[i][j];
            }
            coef++;
        }
        //diagonal positiva
        
        suma[coef]=0;
        for(int i=0;i<n; i++){//filas
            suma[coef]+=matriz[i][i];
        }
        coef++;
        //diagonal negativa
        suma[coef]=0;
        int x = n-1;
        for(int y=0; y<n;y++){
            suma[coef]+=matriz[x][y];
            x--;
        }

        //verificar que todas las sumas sean iguales
        int cont = 0;
        for(int i=1;i<(2*n+2);i++){
            if(suma[i]==suma[0])
                cont++;
        }
        if(cont==(2*n+1))
            resultado = ResultadoMatriz.sumasCorrectas;
        else
            resultado = ResultadoMatriz.sumasDesiguales;
        
        return resultado;
    }
    
    public ResultadoMatriz evaluarNumeros(){
        //1. ordenar los datos
        Integer[] valores = new Integer[n*n];
                
        //evaluar los ceros
        int ceros = 0;
        for(int i=0;i<n; i++){
            for(int j=0; j<n; j++){
                if(matriz[j][i]==0)
                    ceros++;
            }
        }

        if(ceros==(n*n))return ResultadoMatriz.matrizCero;

        int k=0;
        
        for(k=0; k<(n*n); k++){
            valores[k] = 0;
        }
        
        for(int i=0; i<n;i++){ //y
            for(int j=0; j<n; j++){ //x
                
                //Aumentar valores
                if(matriz[j][i]<1 || matriz[j][i]>(n*n)){
                    return ResultadoMatriz.valoresNoValidos;//valores no validos
                }
                //aumentar 
                valores[matriz[j][i]-1]++;
                
            }
        }
                
        Integer cont=0;
        for(k=0; k<(n*n);k++){
            if(valores[k]==1)
                cont++;
        }
        
        if(cont==(n*n))
            return ResultadoMatriz.valoresCorrectos;
        
        return ResultadoMatriz.valoresRepetidos;//valores repetidos
    }
    
}