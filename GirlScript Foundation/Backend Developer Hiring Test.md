# Backend Developer Hiring Test
## By GirlScript Foundation
### 1. Top Articles for Author

In this challenge, the REST API contains information about a collection of articles. Given a username and a limit value, the goal is to return articles authored by the user with the given username, ordered by the number of comments they have and limited to the first ones in that order by the given limit value.

To access the collection of users perform HTTP GET request to *`https://jsonmock.hackerrank.com/api/articles?author=<username>&page=<pageNumber>`* where *`<username>`* is the username of the author of articles to search for and *`<pageNumber>`* is an integer that denotes the page of results to return.

For example, a GET request to *`https://jsonmock.hackerrank.com/api/articles?author=epage&page=1`* will return the first Page of the collection of articles authored by the user with username "epaga". Pages are numbered from 1.

The response to such request is a JSON with the following 5 fields:
- *page*: the current page of the results
- *per_page*: the maximum number of users returned per page.
- *total*: the total number of users on all pages of the result.
- *total_pages*: the total number of pages with results.
- *data*: an array of objects containing users returned on the requested page

Each user record has the following schema:
- *title*: the title ofthe article, can be null
- *url*: the URL ofthe article
- *author*: the username of the author of the article
- *num_comments*: **the number of comments the article has, can be null which means it has 0 comments**
- *story_id*: identifier of the story related to the article, can be null
- *story_title*: the title of the story related to the article, can be null
- *story_url*: the URL of the story related to the article, can be null
- *parent_id*: identifier of the parent of the article, can be null
- *created_at*: the date and time when the record was created

When considering an article:
- If both the title and the story title of an article are null, then ignore the article.
- Otherwise:
    - If the title is not null, the name of the article is title.
    - If the title is null, the name of the article is story_title.

Given *username* and *limit* values, return an array of names of articles authored by the user with the given username, ordered by the number of comments they have, descending. Limit the list to *limit* records. If multiple articles have the same number of comments, order them ascending by given username, ordered by the number of comments they have, descending. Limit the list to *limit* records. If multiple articles have the same number of comments, order them ascending by *name*.

**Function Description**

Complete the function topArticles in the editor
below.

*topArticles* has the following parameter(s):
    
- string *username*: the username of the author
- int *limit*: the maximum number of articles to return

Returns:
- string[]: the names of articles retrieved, selected and ordered as described

> Input Format For Custom Testing

> Sample Case 0

**Sample Input For Custom Testing**
```
STDIN       Function
-----       --------
olalonde —> username = ‘olalonde’
1 —> limit = 1
```
**Sample Output**
```
Show HN: This up votes itself
```
**Explanation**

We are interested in the top 1 articles authored by the user with username *olalonde*. There are 2 articles authored by *olalonde* available in the API response:

1. *title*: null, *story_title*: Guacamole — A clientless remote desktop gateway, *num_comments*: null
2. *title*: Show HN: This up votes itself, *story_title*: null, *num_comments*: 83

The name of the first article is its story title because its title is null, while the name of the second article is its title. The number of comments in the first article is null, so we treat is as having 0 comments. When those articles are ordered ascending by comment count, only the second article appears in the top *limit* = 1. Therefore, the name of the second article is the only one appearing in the result.

**[Solution](GirlScript Foundation/solution_1.py)**

### 2. Message Queues

In a modern distributed system, message queues are important components that provide communication between and coordination of the parts of the system. Which of the following are true?

Pick **ONE OR MORE** options
- [x] Message queues make the system more decoupled.
- [x] Message queues increase the reliability of the system.
- [ ] Message queues, in general, decrease the overall performance of the system.
- [x] Message queues increase the complexity of the system architecture.

### 3. Replication

Replication is a concept of storing multiple copies of the same data. Which of the following are true?

Pick **ONE OR MORE** options
- [x] Replication improves the reliability of the system.
- [x] Replication does not affect latency.
- [x] Replication affects consistency negatively.
- [ ] Replication improves consistency.

### 4. Good URI Design

Which of the following rules should be followed to design a good URI?

Pick **ONE OR MORE** options
- [ ] URIs should never be changed
- [ ] URIs must be constructed by the client
- [x] URIs should be short in length
- [x] URIs should be case-sensitive
- [ ] HTTP verbs should be used instead of operation names in URIs
- [ ] Use spaces when designing a URI
- [x] Redirection must be used if a change in URI is required

### 5. REST Server Response

Which of the following is (are) valid server response formats?

Pick **ONE OR MORE** options
- [x] XML
- [x] JSON
- [x] csv
- [ ] None of these

### 6. REST Services

Which of the following statements are true about REST?

Pick **ONE OR MORE** options
- [x] Logical URLs should be used instead of physical URLs
- [x] Actual URLs must always be used in REST response
- [ ] A paging technique should be used if the output data is small
- [x] GET requests must be read only
- [ ] Output format can be changed
- [ ] POST requests must be read only

### 7. Specifications of the RESTful services

Which of the following statements are correct according to the specifications of the RESTful services? Select 1 or more of the statements below.

Pick **ONE OR MORE** options
- [ ] PUT and POST methods are idempotent in nature
- [x] POST `http://api.example.com/devices/create/{device-id}?new=true` is a valid API request
- [x] POST requests are made on resource collections whereas PUT requests are made on an individual resource
- [ ] All the above