#!/bin/python3...

#
# Complete the 'topArticles' function below.
#
# The function is expected to return a STRING_ARRAY.
# The function accepts following parameters:
# 1. STRING username
# 2. INTEGER limit
#
import requests
def topArticles(username, limit):
    # Write your code here
    URL = "https://jsonmock.hackerrank.com/api/articles"
    PARAMS = {'author':username, 'page':limit}
    r = requests.get(url=URL, params=PARAMS)
    data = r.json()
    name_of_article = []
    for i in range(data['total']):
        if data['data'][i]['title']==None and data['data'][i]['story_title']==None:
            continue
        else:
            if data['data'][i]['title']!=None:
                name_of_article.append(data['data'][i]['title'])
            elif data['data'][i]['title']==None:
                name_of_article.append(data['data'][i]['story_title'])
    name_of_article.sort(key=data['data'][i]['num_comments'], reverse=True)
    return name_of_article[:limit]
if __name__ == '__main__':...