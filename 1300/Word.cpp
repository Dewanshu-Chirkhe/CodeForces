#include<bits/stdc++.h>
using namespace std;

int main(){
    string str;
    cin >> str;
    int lowerCase = 0 , upperCase = 0;
    for(int i=0 ; i<str.size() ; i++){
        char ch = str[i];
        if(isupper(ch)) upperCase++;
        else lowerCase++;
    }
    if(upperCase > lowerCase){
        for(char &ch : str) ch = toupper(ch);
    }
    else{
        for(char &ch : str) ch = tolower(ch);
    }
    cout << str << endl;
    return 0;
}