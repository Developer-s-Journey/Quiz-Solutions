#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int i, j, k = 0;
    for(i=1; i<=n; i++)
    {
        if(i==1||i==n)
        {
            for(int j=1; j<=n; j++)
            {
                cout<<"#";
            }
        }
        else
        {
            for(j=1; j<=n; j++)
            {
                if(j==1||j==n)
                {
                    cout<<"*";
                }
                else
                {
                    cout<<" ";
                }
                
            }
        }
        cout<<endl;
    }
}