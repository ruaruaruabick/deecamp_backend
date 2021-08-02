# encoding:utf-8

import requests

'''
图像识别组合API
'''

request_url = "https://aip.baidubce.com/api/v1/solution/direct/imagerecognition/combination"
base64 = "data:image/jpeg;base64,/9j/4QAYRXhpZgAASUkqAAgAAAAAAAAAAAAAAP/sABFEdWNreQABAAQAAABQAAD/4QMdaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wLwA8P3hwYWNrZXQgYmVnaW49Iu+7vyIgaWQ9Ilc1TTBNcENlaGlIenJlU3pOVGN6a2M5ZCI/PiA8eDp4bXBtZXRhIHhtbG5zOng9ImFkb2JlOm5zOm1ldGEvIiB4OnhtcHRrPSJBZG9iZSBYTVAgQ29yZSA1LjYtYzA2NyA3OS4xNTc3NDcsIDIwMTUvMDMvMzAtMjM6NDA6NDIgICAgICAgICI+IDxyZGY6UkRGIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyI+IDxyZGY6RGVzY3JpcHRpb24gcmRmOmFib3V0PSIiIHhtbG5zOnhtcE1NPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvbW0vIiB4bWxuczpzdFJlZj0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL3NUeXBlL1Jlc291cmNlUmVmIyIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bXBNTTpEb2N1bWVudElEPSJ4bXAuZGlkOkUwMjMzNUI2QzFDRDExRTY4OUE2RUQ2MTY0REUzNkJFIiB4bXBNTTpJbnN0YW5jZUlEPSJ4bXAuaWlkOkUwMjMzNUI1QzFDRDExRTY4OUE2RUQ2MTY0REUzNkJFIiB4bXA6Q3JlYXRvclRvb2w9IkFkb2JlIFBob3Rvc2hvcCBDQyAyMDE1IFdpbmRvd3MiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0iNTBCN0ExOEI2QjY2MkEwODM5MzdGQUU3RjBGRkIyQzciIHN0UmVmOmRvY3VtZW50SUQ9IjUwQjdBMThCNkI2NjJBMDgzOTM3RkFFN0YwRkZCMkM3Ii8+IDwvcmRmOkRlc2NyaXB0aW9uPiA8L3JkZjpSREY+IDwveDp4bXBtZXRhPiA8P3hwYWNrZXQgZW5kPSJyIj8+/+4ADkFkb2JlAGTAAAAAAf/bAIQAAgICAgICAgICAgMCAgIDBAMCAgMEBQQEBAQEBQYFBQUF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"
params = "{\"image\":\""+base64+"\",\"scenes\":[\"logo_search\",\"object_detect\",\"multi_object_detect\", \"red_wine\",\"currency\",\"landmark\"]}"
access_token = '24.423afa94502b83da9f8c121620a94456.2592000.1630477562.282335-24637773'
request_url = request_url + "?access_token=" + access_token
headers = {'content-type': 'application/json'}
response = requests.post(request_url, data=params, headers=headers)
if response:
    print(response.json())