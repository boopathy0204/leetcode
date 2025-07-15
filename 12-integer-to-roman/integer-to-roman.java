class Solution {
    public String intToRoman(int num) {
        StringBuilder sp=new StringBuilder();
        while(num>0){
            if(num/1000>0){
                sp.append("M");
                num-=1000;
            }
            else if(num/900>0){
                sp.append("CM");
                num-=900;
            }
            else if(num/500>0){
                sp.append("D");
                num-=500;
            }
            else if(num/400>0){
                sp.append("CD");
                num-=400;
            }
            else if(num/100>0){
                sp.append("C");
                num-=100;
            }
            else if(num/90>0){
                sp.append("XC");
                num-=90;
            }
            else if(num/50>0){
                sp.append("L");
                num-=50;
            }
            else if(num/40>0){
                sp.append("XL");
                num-=40;
            }
            else if(num/10>0){
                sp.append("X");
                num-=10;
            }
            else if(num/9>0){
                sp.append("IX");
                num-=9;
            }
            else if(num/5>0){
                sp.append("V");
                num-=5;
            }
            else if(num/4>0){
                sp.append("IV");
                num-=4;
            }
            else if(num/1>0){
                sp.append("I");
                num-=1;
            }
            
        }
        return sp.toString();
        
    }
}