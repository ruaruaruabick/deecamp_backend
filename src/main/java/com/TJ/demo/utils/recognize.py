# encoding:utf-8

import requests
import base64
import sys
print(sys.path)
'''
图像识别组合API
'''

import os
print(os.getcwd())#获得当前工作目录
with open("../../../../../../../tempgraph/tempgraph.jpg", "rb") as f:
    base64_data = base64.b64encode(f.read())
request_url = "https://aip.baidubce.com/api/v1/solution/direct/imagerecognition/combination"
base64 = "data:image/jpeg;base64,"+base64_data.decode()
params = "{\"image\":\""+base64+"\",\"scenes\":[\"ingredient\",\"plant\",\"animal\",\"advanced_general\",\"logo_search\",\"multi_object_detect\"]}"
access_token = '24.423afa94502b83da9f8c121620a94456.2592000.1630477562.282335-24637773'
request_url = request_url + "?access_token=" + access_token
headers = {'content-type': 'application/json'}
response = requests.post(request_url, data=params, headers=headers)
result = []
if response:
    res = response.json()['result']
    for key, value in res.items():
        for i in value['result']:
            if 'score' in i.keys() and float(i['score']) > 0.80:
                if 'name' in i.keys():
                    result.append(i['name'])
                else:
                    result.append(i['keyword'])
print(result)