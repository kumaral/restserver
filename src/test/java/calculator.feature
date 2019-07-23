Feature: Rest based Calculator Application
	
	Scenario: Addition
		Given rest api "http://localhost:8080/add?first=10&second=20"
		When I invoke api
		Then expected result 30.0
