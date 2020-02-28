Feature: Api Call Testing Using Karate

    Background:
    
        * url 'https://some-host.com/v1/auth'
        * def req = read("classpath:Karate_FrameworkAPI/myreq.json")
    
    Scenario Outline: Login as a authenticated user
        Given path 'users'
        And header Accept = 'application/json'
        And set req[0].name = <name>
        And request req
        When method get
        Then status 201
        And def myJson = <name>
        And match response.name == myJson
        
    Examples:
    |name|
    |'prsdfd'|
    |'cjy'|
    |'8y9oidhi'|    
