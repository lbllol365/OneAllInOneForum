import feedparser
import pymongo
import time
import yaml

youXiaRSS = "https://game.ali213.net/forum.php?mod=rss&fid=77&auth=5603nHEfGNyMFFvx6EXt%2BhtbC1S50l51Lb%2Bxk60P8wE%2BTC75%2FxXJsLu9jqLDw2P8%2FA"
fitgirlFeed = "fitgirl-repacks.site/feed/"

youxia = feedparser.parse(youXiaRSS)
mongoClient = pymongo.MongoClient("mongodb://localhost:27017/")
mydb = mongoClient["resource"]
mycol = mydb["rows"]
dbList = mongoClient.list_database_names()
for item in youxia['entries']:
    title = item['title']
    link = item['links'][0]['href']
    data = {'name': title, 'type': '网页', 'url': link, 'getDate': time.strftime("%Y-%m-%dT%H:%M:%SZ", time.localtime())}
    x = mycol.insert_one(data)
    print(x.inserted_id)

