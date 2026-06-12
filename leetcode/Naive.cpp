// You are using GCC
#include<iostream>
#include<vector>
using namespace std;

int main(){
    string str,pt;
    getline(cin,str);
    getline(cin,pt);
    vector<int>index;
    int m=str.size();
    int n=pt.size();
    for(int i=0;i<=m-n;i++){
        int j;
        for (j=0;j<n;j++){
        if(pt[j]!=str[i+j]){
            break;
            }
        }
        
        if(j==n){
            index.push_back(i);
        }
    }
    if(!index.empty()){
        for (int i=0;i<index.size();i++){
            cout<<"Pattern found at index "<<index[i]<<endl;
        }
    }
}
    