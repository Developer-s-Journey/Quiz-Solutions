#include<bits/stdc++.h>
using namespace std;
int main(){
    int arr[26];
    for(int i=0; i<26; i++)cin>>arr[i];
    int target;
    cin>>target;
    int dp[27][target+4];
    for(int i=0; i<=target; i++){
        for(int j=0; j<=26; j++){
            if(i==0){
                dp[j][i]=1;
            } else {
                dp[j][i]=-1;
            }
        }
    }
    for(int i=0; i<26; i++){
        for(int j=0; j<=target; j++){
            for(int k=0; k<i; k++){
                if(i-k>=0 && j-arr[i]>=0 && dp[i-k][j-arr[i]]!=-1){
                    dp[i][j]=1;
                }
            }
        }
    }
    vector<char> ans;
    int i=25;
    while(target>0 && i>=0){
        if(dp[i][target]==1){
            ans.push_back('a'+i);
            target-=arr[i];
        } else {
            i--;
        }
    }
    if(target>0){
        cout<<0<<endl;
    } else {
        for(int i=0; i<ans.size(); i++){
            cout<<ans[i];
        }
        cout<<endl;
    }
}