#include<bits/stdc++.h>
using namespace std;
#define rep(i, n) for(int i=0; i<(n); ++i)
#define repA(i, a, n) for(int i=a; i<=(n); ++i)
#define repD(i, a, n) for(int i=a; i>=(n); --i)
#define trav(a, x) for(auto& a : x)
#define all(x) x.begin(), x.end()
#define sz(x) (int)(x).size()
#define fill(a) memset(a, 0, sizeof(a))
#define fst first
#define snd second
#define mp make_pair
#define pb push_back
typedef long double ld;
typedef long long int ll;
typedef pair<int, int> pii;
typedef vector<int> vi;
int main(){
    cin.sync_with_stdio(0); cin.tie(0);
    cin.exceptions(cin.failbit);
    int t;
    cin>>t;
    while(t--){
        ll a, b;
        cin>>a>>b;
        if(a>=b){
            cout<<0<<endl;
        } else {
            ll ans=1;
            for(int i=1; i<=a; i++){
                ans=(ans*i)%b;
            }
            cout<<ans<<"\n";
        }
    }
}