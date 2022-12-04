# Library Management System

## Table of Contents

* [General Info](#general-info)
* [Features](#features)
* [Technologies](#technologies)
* [Database Model](#database-model)
* [Authors](#authors)

## General Info

Library Management System is a web application that manages the library. It enables viewing the library catalog and taking actions on library materials and users. 📚👥

> Project created as a college seminar:  
> *SRC125 - Programming in Java*  
> *University of Split - University Department of Professional Studies*

## Features

### User Management
- Roles:
    - Member
    - Librarian
    - Admin
- Registration and login
- Edit and update user data

### Library Materials/Resources Management
- CRUD operations over library resources (add, display, edit/update, delete)

### View (& Search/Filter) Library Catalog
- Pagination
- Track number of available copies

### Resource Borrowing - Loan
- Issuance and return of library resources
- Limitation: max `x` resources on loan at the same time
- Option: extend the loan for `x` days

### View Currently Borrowed Resources

### View Borrowed Resources History

## Technologies

* Java
* Spring Boot
* Thymeleaf
* Bootstrap
* DBMS `{{TO-DO}}`
* Docker

## Database Model

![Database Model](https://user-images.githubusercontent.com/92815435/199240893-95d98a97-8075-47b1-9ef6-68f1b7be7d40.png "MS Access - Relationships Report")  
[![Draw.io - Database Model - Reduced ](https://user-images.githubusercontent.com/92815435/205509557-f4e1a40b-3210-4ccb-b4a5-38f2dad7afbd.png "Draw.io - Database Model - Reduced")](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Library-Management-System.drawio#R7V1dc9s2Fv01msk%2BJEPwW4%2BR0%2Bxm6rjZuJ12H2ERlthSpJaEYqu%2FvgC%2FRBIARdkSKBPoZKYiDIIk7sE9wMEFMLNuNs%2F%2FTuF2%2FTUJUDQzjeB5Zn2amaZpGR75H03ZFynAAW6RskrDoEw7JNyHf6My0ShTd2GAslZGnCQRDrftxGUSx2iJW2kwTZOndrbHJGo%2FdQtXiEm4X8KITf09DPC6SPVN75D%2BHxSu1tWTgTsv%2FrKBVebyS7I1DJKnRpL108y6SZMEF782zzcoorVX1Utx32fBX%2BsXS1GMh9xwZ5mGu%2FTM3dxz%2FwR3UfDf%2BO59WcoPGO3KD%2F4tQ2n5wnhf1QJ59y39ieEDTVpkGKa4NJZlkARS%2FRiGMbnV%2BgTy6yiC2yzMsxcp6zAKbuE%2B2eGqoOpq8Rg%2Bo%2BB7YSual5jtlhRGL2nhj6Tw%2B%2FJl6J9hFK5i8ntJvpw%2BcZGijLzLLcxwmaP8KpRi9CysLlAbgcAXJRuE0z3JUt7glWYrgWuZ8w9OkfJ0wEGda93AgOmXibDE3qouvH7ed4JVGK%2FIJ9UPtJzWA4FrMI%2FjPc3qPAxGpE5iiNEi2cVB1oQE%2BdH40kNSDpQTQGMyoOkHzHcK%2B8U6ScO%2FKUyi0qxNEOXXT%2BEmgjFpTzDoJC2S3IHkYAij6CaJEoq0OIkRAzaaKUiT7a8wXSFcJmyTMMZ5DTkL8o%2FU2Y1B7OmQd70h1%2BBwTf7R7Cm%2BSeIMpwTUtAxEsPWEKL4WONmWhUbosSo%2FLQ1Cfz8kGCebU5AobposPPdtsx8DYxceTSy2cHEqCCwGBN9%2BFsKAfCwOYXRAfe4xqMOGB6NxLMut67p%2BuxXf9RMJqfbHKPe56zAIUPwqe5h8ezQMYJ1Y%2FxxfcGJpEhq7zdh5RxjiC%2FlhvIM7nMS7zQNlDOM9LSnG%2FxoZBBU5FHkX2RYuw3h1W9zpdlDiyELJ80zYau2zomZQcRJg42hK4FGCcUFK4HQY5FKCO7xfIMcXoCCsyjs%2FHzhq8oHHGDlN8ld9hwgVXL33l4IB5by9r0cEo7v%2F%2Bdjuf66U%2B%2FfVdP%2BVLtew8mOYZvgObnIS%2BAHT5RpW4wHSXIj7VYwUBMhQjhQAKy5qVpDNCsAcmxbACXLhBHgBCOwxeWJgBcEIal4YgAz1iIHVFDUxSCcGZ3RicNQiBltRYmBlwYA88JfHRZiSVyXcQC9xuEGq8YEAEOrxgafdv3T374%2Fu%2Fv1Je3tPUW%2FPqoBoA8NIjwF6YaGcz6%2Bj4rTPl%2Bbz66DK0Xx%2B9SHT9PmNsE6lfH41bmv4%2FDwedInvquAg7fvF8FDP91va90v3%2Ffbovt%2BetO%2B3FPX9rIi3hVn2lKQBdfuFz%2F%2F8EMYwr46D85%2FRhRz0%2FWG2Vo0IBFhRjwh4EYNuRG2wJpXpruiv2%2FAhJeB5%2FxXGcIU2pGrf3%2B8zjDZVVvLoQ%2B4qMQh%2FdJOIWeMWytz%2F7%2Bjimzwi%2BH2WE8tHkgHMt8%2FFbeXfq4I%2BQYI6mNHKLFc6FQU%2FpFWO7yjYLRFFvigvedniPdrvRpJbb9xpDgRieaXgTVR6L9KIkr9QB%2FWchlBieVbEOpdXv%2Batg3ZIrMXTOsTonqTTRz2lcCuAe0pRgCqiHQT%2B%2FvmuagTYMx9h8XBaz2ifn6HY2MZFkvzV31npdEwmuhoKAKttLtPhrocyOQYzL2cwHXc4rGf5upVIpkC06lmKxMPB5XqWrOY49bVIikYfVo9sWPqBeGi9GulEnIh7mmB%2BVtwMKk4GcHQsogwN4ghT8FYoSWUKi1UqP4%2FNFBeVJSxFoxEtNhrxKUlLongLvCAHBurxgA49vAIe4C1VkssDaoUeWoqGHlqsvrjdPURhtkapDkw%2FCg%2F12EEHIsonA%2B4KJblsMOlIREvRSESLVQX3CKa%2FPH4rKKCYg1Q1%2BFyECuV8fjXFpH2%2BTJ%2FPW3wk1efbk45EtBWNRLRZfe%2FL%2FeJO9%2FN7UaGez9cBiCP4fN6KI7k%2Bf9IRiLaiEYg2q%2BWRhop32UzNPclEOFDPy7uM4VGwQtVsO%2FGY62SVxDD66ZDaCXM75LlNcpvTZvsnwnhf0gCNOZi1AvPQc4j%2FaPz%2BHy3qg1NefXquXAG9qCiCGDTd%2F9G8aNxFLw%2B35Vc1tdDggeJFwLwGDf1IIWSqbm%2ByS5eoz5kX%2BXDFSaJ8jmBmKUURxOGP9ouc36OzEXu3SR7lScs1DWLAlLSrXrKfKRHAZ1dz71X8nsuN33OMD0bzP4ttyfXG5Oe3pg7nkxHOZ58ezjcAFpfrtSkX3WcrGt1XiULNLaSIN9fRfSfipGcdifm6htwPo5eULgNWOvZPxvD%2FCK3wYv%2FGpBWHlQqnHQoo6qlPnlXYUMANojyiajCgCAiaNtrVJFYLNUtciiV4kYGjsgQrLk6cJRQNFXTYUEG02UbJHiFleeL0%2FQmV5AlWg9TEIZ04uFGEozLHCWLmFHhD0ShDh1UnaUThlyzb5ftAqBpfKMKDJo%2F2kWms5EknsD4hDMOIzmAX81g0LaN7UWT91DJTYi7Lq4TiY3NZrIkvN3nlapVRxuSVK4hh6528kkj7LisrTny2ylVUV3Q5B54cXLeetDoRLr0dgzP3BK4DP3opsoxx4xHC4E9LySQM1RRGV1GF0WUVxkN0w1vgBTkwUI8HtH54BTzAn3iSyQOsXjhxHlBUMXRZxfCwh52CPPASoXCKPFBtxq7dvkS3L5g2kuj3vUkvRPYUXYjssTIgnQj6jvAujdsTQ7Mbc%2FbRKPUhGNGqN427325vFSMCEVTUIwJ2dfKE162Zs7OuW6vWEB1duCYaf8pZuOax4h%2FLAy%2Ff9Z%2BZhqMNMlzC6GP5hw1przlueNv%2Fn32r%2F3of%2F2qWpoqZabY%2B3mydc6nqd8ZsYkazifU2sDM2DM8d2DBEYV%2BDG0Z%2B68c0hftGhrLreCj5G01oQMTrQKRsIZ9flp%2F8KN7gvJ6ZlfBUarWezZtml9puWa3sbroGsDtnblgmN85BqgFYlWrCLcAz%2FJYBzPn4BmDVowm3AM9sG8AyvbEN4LMyzVhdh6G9c3A1vXNzcO9coApethPCnnJUN3hRPwQY3qtvORDrRXsvPhuhNmHfDQAQGWY838GqQhN23sAAV9eB9Nmgrd%2BTVB%2FxRv9qG50GAwYf8QYuJo%2F7OkpKRlitL9g07FqOePPZKKmJh9X6ioZJ%2BazGcji5R8fTDsaJctv9%2BTqOSsaE%2BhGmGP2IN1%2BtdZe%2BolFUPquD4RBH%2BkifflgoxwrVa2gSkEgCo5%2FvNp90UNVc0aCqOSufBShbpuEWhwnd9Pddrp0p7PZFyFDP7fN1vuzjDhNf%2F%2FZX0fPnaF6p%2F3WW1ftc%2Bc%2FjGBgYpwGmmt3rzIN4HNrgPW4MPGkZcni%2F4kXg7GnGJ8mSQwBzvn4GX5a8%2Bfzz2B2QIeLkGe10XKw8L89cC830iZVT0SYvD5PntlGb%2FQn%2FvN2TIcXJwI3WKofPakmjE552KZdOWO2ypJOxNUzJdHJc1JwmnbCiJswHLJpQTgOKcoRSj8C6A94b8tgVoQ2kx7zcMW%2FnWCTb0IPeBqj0nnZjjHpLZF3vsBcYrBKr5Li3bCHq9VSAwQqseuT7AqAo2FPRUuoYY99jpDL64BcYQjFVrdFv2UJUJBVWTl0W45e9JpYTwaIgsbCiajn63fcTzBsY%2Bw4CyLGxbmc5jmNyl%2BNw13f0jXVf6fX1ob%2FDuwOv8ROnn%2ForNWQLGKz4OfElHiX21QvkqpdmColeL%2FQYjhblgrsA0LqkjCjfY5wx%2BloPAFgdcmQncdHA3xL4KhIGKzfGcKNXexzBhYLUwKqLRcxvP0F0yMCe6BAQdEN8B3rwy63vB4BV%2FTSXX2D8BwQ6UT3xPTqXs%2BLf1Md%2FBfZVpHNWqmsGOunR33CsKEjxWjGUMvo7whi8wCXJjMEqhiM7iQuP%2FlSVCytYNQz9GKYZvtNDwKPgUI8fOLsaajq4OB3UU4Tj8cHE3b9ocD999885aRdq7z8EGwp6f5sx%2FcT2Zy6%2B7yz7MVe7ax7dj9kS4EvOaSnAHPW8DhlH4oxhVGFQ8oV32XY7B0uYbmf%2F6%2BO3WN7RXbbt199iO1I25gamq%2BE9GN71jMFRfItWB8pyWt6bY6IRrWoMPRpAGPEqy6z%2Bm2usb6CDIdoaQpZRlTpWxa4%2Bt6ZGd%2ByN%2BesZZkVOp%2BieX8Y9iFauAdigugk3AVCfQVi1ATD64RTAMhVrA20TmLY7tgFYpWnKbcA2O07IGd0JKXUuKnA7BjDtK3BCbEDWlNuAZ10dESt1yijbBtwr6Iwqdc4oq3uNf9AosNgon0mboOOG7GtoBeygeMqOyJq3TeA44HImIJdpkuCmkEy%2Ba%2F01CRDN8Q8%3D)  
[![Draw.io - Database Model](https://user-images.githubusercontent.com/92815435/199234466-15d34b63-ee7e-4a9a-ac1b-c7b29cfb9918.png "Draw.io - Database Model")](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&title=Library-Management-System.drawio#R%3Cmxfile%20pages%3D%222%22%3E%3Cdiagram%20id%3D%22SNOo6PtL7Mm3kq7FhRa3%22%20name%3D%22Database-Model%22%3E7V1rc6O4Ev01rtr7IVPmZeyPk9femckkqck89n4kMbGZYPACTuz59VfYgDHdyBCwsCVtTdUaggGrj%2FpI3UetnnYxW%2F4dWPPpV39suz21P172tMueqirDoUn%2BF59ZJWdUvb85MwmccXJue%2BLB%2BWMnJ9PLFs7YDncujHzfjZz57skn3%2FPsp2jnnBUE%2FtvuZc%2B%2Bu%2FvUuTWxwYmHJ8uFZ38542ianFUGo%2B0f%2Fms7k2ny6KGa%2FOKZlV6c%2FJJwao39t9wp7aqnXQS%2BH20%2BzZYXthu3Xtoum%2B9dl%2Fw1e7HA9qIqXwgWb3Mz1H9efb69Cv83XPxefvx8pm%2Fu8mq5i%2BQH%2FwjtIHnhaJW2Ann3efwxsh7jU%2BdhZAVRYiytT06Q5o8sxyNf1S6V9bHrWvPQWV%2B%2BOTN13PGNtfIXUXqj9Oj82Vna428bW8XXErPdkJvFh%2FHNn8nNH5KXif9suc7EI5%2BfyC%2BPn3ge2CF5lxsrjJIrYNskzfVqB5G9zJ1K2upv25%2FZUbAilyR%2FNROzJcDVB8nx2xYF2TXTHADUYXLSSpA3yW6dPe0bQarlTcgPyh6nGTuPU5DHYU%2FTCg%2BzXNIinhXZ5%2F7CG4d5QJAPud%2B5PbWGSQ3IGAAydLh8i0F%2FPvUD508MEjcxah5C6%2BM3Z%2BZaHulM1rhw6txfu481FBzXvfBdP8aZ53s2gFp80Tjw59%2BtYGJHyYm573jRuoWMc%2FKPtNlF%2F4PRM8i7XpBjZXtM%2FsWXB9GF74VRQCAd38MmyHqzY3SdR%2F48ualrP6f3DxKDxJ8f%2FSjyZ6U4pPbC%2FeBc7Zp9HxiL8MhjcQcXdUEwACC4%2F1IKA%2FL7I8dyt6hf%2B4vYXVtboyGWRds6a99iwxe9hE%2Ba89lde9ypMx7bXnV7GJXtkTOAVrP9EV9Q824MOrsJ7Lwg%2FPCJfOj%2FZS0i31vMHmO%2B6J%2FFd%2FKi%2F3QMgpQaNteeh3PryfEmN5tvDgooMVihZNkr7bV6q6ipdLt2YTP%2B9Ofq9%2BRhqb98N7Sru5%2B2Fr6eDSUlYJTQPyAlVB2ftEEJqM1HwFVcd00J9thJ71edEWiAFosR0JZIJ2Y5Owe%2Ba28o4RQYgAkKePb4qL8aAlRICmBNAaOuZwWQAk6RAKj4FooA0JZACODZCcLo1prFL%2FzXqxU8Ta10TkC6C3G%2FnJBCQ2QIRwqKAqAiWYE1Kyhq17SgqPzyglI9sMw9MWjAzK4lLi%2FUQIZ4xADzTpIYmBOD0Tkx1MglnRwxVLcH98QAs0Vj8sC753MnIK9KuCE%2BjJyZzTUfVAeEeHxgSvfP3P0PO3f%2F5Wmik%2FP2ZuXm597bwyigPbMcV8g5QHVYCOfzM12c9PnMfH4mq%2BzM56dCPA58fgpg6fPP0nlbzuevFaFP0W0qEBLO99eAh3i%2BX5O%2Bn7nv1zv3%2FTo%2Fvl%2Br3Pzc%2B34YxJtbYfjmB%2BPY7W98%2FvWj41nr5tg6%2F168lCN%2Bfyucck0E1bEiHBFk6xx2QsADNzbClDTSYBJ%2FunEeA4Kes6%2BWZ03sGWnus4dVGNmz9FLy7O3V6cmx81o8Rezq7cBs8O8iXn%2BzlgWfhWtm%2BUguUEbz5eZryd%2FTG11aBHZWGLdmstgpe4HNvXefR07vvEUB4wQO6x8azdzEJZGe4b%2FYBSgj6E4A2tuImJOj72vIxwMP7fxt6kT2AzkfP%2BotsOYlGA5i09ope0JE105ipcMeSpJBw8BHWzbTiHWGUJp27vsv9AFIYbDB6RonRdF2raVhEjIVsVZ2sn1z1RCRCT1WrLG%2BaFhdo0RZYITh4HBSQsgLPK0wylAux48jKBJ7JP5ZrjGqiZPysaMyahU3lW7HAjgw6CSZomFUoT5TYOuO2DIFlJ2d5sIjOsglUYygaOzND154W3nUFAbi8YBce3QEPFB15ng4HuBlASod5JIHlD6cG84Xj64TTsXMNNbAhnDkoPTLBQeSDA5FBuiaI6ZsoPTLBwGn5vszDEvnT9oCTvdWthXcPd9vKGCTWBRDUV4DFwI6%2FnK1gXT8B3P82Joixo7f4Mjxy0VE27aAq4g%2BPZzfijjgr4ML8Ry%2FIsWFHTh%2BbDURW8ev8CMvzDAsHT9pCygwJH01WoSx67e9xYxrV18DCcK5egNKB77ZoR28WpHjx0K%2F%2BIlq%2F5flRGRqGNFpoSeE5EtPtXe0FUEGYt5MqVmvrvVAU3aep%2FURdA6OBE4qgJMcSTSUnhnVEUqRnmGAPNhAwoARJp6kZxnK5dDCgIqCYMsfUoFWEy6U1Qt1ZwJ0%2BFS6HQv8yL0QWp961icMTIHGljBgZIoj5YEhd0PImgJuhzCzY2oQQoNWAwjCMcFAVjo9AibANGhMmWBQYwZ5ajwwkCKErCngDHHdcb87m1KnIogPasBBPDaQ0gP2zh%2FVnLH1%2FvwoDwZSeJA1BZzd2d5YKFffSuXSk3f1S1u%2FOo8mvnZ3eXe3ePDMwPuRboSYs7s9nthp7I14zak%2F8T3LvdqeLdRc2F5z469NHnfd33YUrRIqiCOQvZ0qEfbSif7Jff5ffKsPRnJ0uUzdQXyQ0gQxcbD6J3%2BQ%2B1Z8uP3a%2BiijlziUuHkRZYRiJhVY%2B4vgyabAKPGOUUpDpdclF8YNSQVbYLtW5LzaO6%2FRxKujFoalaaWFG1rY1LqyMO7f4MqhG9%2Fa5o%2BJAQPiOKlDup6Q2WMdT9Z96Of%2F06CjpiaTG9kyLWgmAzHt5XCz%2FtEwh7sXFgcbmZswPMdTSjcDvRytmzAC5xJfLnO5NXFCHcg36sh7x%2FW1784CVjDiJ2mlYYinPq3gmd4OaQXqRzhK%2FJpSg5w1BRR6CJT4rQEEcWnj8vPly%2F3w0Zn9ur25evhx5y29izN1JFmCzhIAU5WJo2YWmAlLoCDQ4JT0dFhij30oqOeaJXBDw1mmPZu7%2Fsq2eeCJNqEgLk%2FgDCuL3h7B9KIkg9zd%2FGIImeNUeGP%2FoFJWwM3MDHkjTit%2FCsOFPe4JkmSugQdJHoUlokj%2Bijzx2rbpJNITImdlplGjNIiErXjEdiTIVrm2v1RdreHYheb7GlmqbTdolKaqu89KQyDwnZhS5B55ubZAUlMbNy2zU3XBQhkCKK2Cp9LtmKBHZqBanyK%2BgzKwFBRjyuA66aTInfVybQHTTrGY4dImQ3Q35CGm2CoeBCQFqE2XpMCeFLCME2NSgCuTOaKEQWWD8E8JcLOLsbUK43iPEGxQHQoCsoHMIh0DG6BpJLZ0gEgOOKIDmTnaGhrGDyOf9OT7wHnarE%2B0n5yZ5SYRpbG%2FIDbgmyFaySNxyhCaJIQuCAEris%2BYEMprYp%2Bc%2F09BLP0%2FaQsYDIzFAvfWalc5kPh%2Fy43bXO3f%2Fri54ZoFamCEZxZAFzQrMA%2BVq5qcBBd76eLX3J%2FCc99%2FCekM0jt%2BTUF%2BvbOKYqq%2BxiD18LSqyiZi%2Fmwvu3pVlU1z93lmxcd1gTaZt6o%2BBtkPTXqPbqR8qAKY1qoqKJC4YuHDxfWX8v36jkf%2B8F47vSu31W7tfval%2B%2FGmgKktUHr5FIKZVfQPh0fLcte2%2Bdr6w1bRU%2Bl2LOAjE1%2FVBXTMWAUTR7BlFZgGS1il6%2FjnIVnlXekxPlkFZsceyZxF0kk9mAhHJzp0D7LI154NIfJVvqjjF%2FZVvn5anw3lXlPPRsrVxdJRHy%2F%2B%2FXwGMyU3Wy1VFu6Iz3ES5yg18fvjGjqye1P93aIamREGr%2BTAr%2FrKCWrPOMotmtA35maHJirEhcpvoC0Bg0RA%2FyrQqomGYOG5Ni%2FaNHJ3pibZ73aoguXmTOgb87I3ExXhkilg4Gdb9vEUGIEJCIRjABgOkgzAmgFYbsqEvjFURXPEAMPK5uCdAVLJxcnGfpmgQDgKUOD%2BDdLlH9jlM92KCX%2FlITcePstpShePFDqKBa7f7GgReAXB64Xa%2B9jvcSt7bQoV4XggfQ0xUnxUXeveFF%2Bq2cin%2BGhTzyPZxwdZBP11XaU7nDpz%2Biigd%2FzpvHS4Ed%2Bl116GryBc1nXoEFDhMq04GuIRkvune3vlNQBHsjgKWVktR44Na7Kp1QmpA2Ey%2FspwjHGiuUU6yoUaTaJNgSySnmV0IVxysSlaKAPKuksd9wwoq9yOBXygoEjyRcPFtfX5gqXkGIeBCmBwmuFlOsglXWhQdJTsAcRbiLkpEsSjAqhTklTAnAqwRCNbKqghODo5Iqi%2BBzz3RAAlReuOe5nUYBNht4YacBCPDWrUYpRscCg2QHOQbOmgRkDx5OhAyKQk3hQwYGh7Y6HIoJW0I59kkL6G9P0sfT9WcI2p79e7rmLSnqtPESxdfbZMOOfq56IW2qwBC56d%2FtBStFfjj%2FHv7G%2FP%2FhL%2BWD7%2B9JGlxtAdkEaLbZLTihCP6r%2FYBYMjGABSgdgEzpPlfkz%2BMCOmXEPqbepE9gOxevzMt8Ca94qSFmjs2mE%2BpZ8m8NOQPBaIwSQERnPnO%2F705%2Br35GGpv3w3tKu7n7YWvorW%2FP3d5texfsay%2BSsEQyekGebVf7za33WOveQH7XU1magAqlowV6H2D1V8QIUqZIbqs1Ri1q36jAaW%2FVUnNtflFWnUNEV7krT1Vz8GgbXKXZCMmbd3vo9PbBGXIum65O9J59tCavOA97IQ2rRwsHI6bpDqWCr7RnXXDSjDQbeeEWYQRbMIVheV6dAAjg2%2B%2Ba4ti73EjFjoLgNErFllO3RqTdtm1oMujW44UaMrOCLoPaJh9ZdG%2B243QwU31WDooBcq%2FoI3BZxaBMR7C6fVbIoT6uKfRh15T3zmHXdnAStZKKZJ0L4lWsErxXRIKzVKDB9xTJ%2BOeMkpSMlgz1pvmPLXqxU8Ta2UTkjfIb776BmFDSokg%2ByGWuA8%2FtjDe0rb4T1kcSl1nJIP5aEXJvIZ9otLcROfcjitvnZb340F6EPzAxINYBm6UeE075ZfA%2BiFpJo6GHbc%2FHCQzDH%2Bsxxmti6648AlstM7x%2Bg31e6a%2F%2FLz5cv98NGZ%2Fbq9uXr4cectvYszJRV9HwHDU%2Fkd5cz3EXWas8wTNdo4myXTzFJsqYcs5L2N%2Fk5Obf%2F1GoscHJxdcOw1i6OG1CTdeU0owebYaxbHDN03P5RGc4z%2B4phBxyJaTNPNsMABx%2Bgvjhm6b34ZFKhccWo4gmMN6i5GXel7UigqBYlZqrorG30ofbPhF9Qhg%2FFKuq5PYvZ9mKVVZxUPsoUh%2BYEga3QJ2XcV9mMBWdpmIXtVlEoabOsas%2F1iHFKnT%2FLAFwZMvKZQwRmlX3AknccmkRXXHM8zFKUwz9MVpGgj0%2FaH02yh2r%2FrFRfIEmSu%2Fc%2BxxTl0ONHmGP%2FFQKrZefPD1BTH8NcKe3IanedGQOv%2F8oMXYIDTVNQja9GA9co9VbGrZLbbVyBdaUPWhidrgLXolhJV61gZAuV9olTq2EbV%2FUYgOGnF%2FHvsoeL24EjciP5sqJd%2FI65ZCL18iygpFztmVfDbQU2l2zGAjdTD19XDt88RWPaKKUecrvz9PcYwxCQIGDiLnMjlUf3eIiiE44M0GyD9Pzv%2FjxXRYer%2FVZgK5sjfbyAtnsNHZNxjO3wKnHnk%2BF7s99eBMoGdfhkyhPP6yM4W94tH1wmn8ZRRRveAoGKARWLR6N7gUE4b2aRCUnf74T2tJFJwNPE9GPjhPMCnCcrnyJ4T89RJyzhfTbCIR%2FE1gjxC00Wzmd4euug81FdnxwoO5n4b1AvIFVCmxWmpizZRIR4pQDWZJAXmpNB5%2FA8RtXFNCiWLmHknBR3Kt56caCVJgYoK4UhBlxzAngPQPczYkkB55o8Dn6%2BXND%2F3Ph%2BGB5%2FIwzY%2FXrr9cmAI5%2FYHuLg7%2FLiIiK8%2F%2FbLp%2BNLKhqLvgkBfxbw4thsZtXA6gpe08EFh1a1Z8XFdwEkFcJLDirJhxbuwSenFtdJVh9otD38%2FXI9%2Bcf0FLqM6vqRVi3baPx5pl2aOhWVoOnVe0lWHh8ly16j54cSw3dFJlduxwI0UqldXOzCjEyydxZZOYFYzoZOuI5iM6WS%2FqJ1POoHpTGs9X5GEUg8o4hEKzJCup7sX5KkTwhocbBR2kBnvYHcGii5JF3TGK5Opncx4h9QhSucz3vRhws9492dduRyimDCuKme89WEi3ADFlAHUTma8dDrpfMZrlgZQxZrxmoIGUE0kobuZsqwkpdSDiniUAoOoyXR3RaeWE5jsVoLHvsltodogui02usqvjX2wcZPJZRvVRwENXERJWOxYVvmZMM7J%2BSo%2FU9CVGyaMS%2B7yu1zkVxkrwmm4TBmCZKHl3cMWnS%2FyS4ebgqznMAVdzzGEkUW5yG8vKoQjhRGEyUbTS6eGAg3onM75lKKEV%2Blj2x%2Bzrdw8krFfFrO%2BEV3dVLXGz%2BFgIFzx5tH%2BqC6XVD6CUd28jknO%2BSojRTx6l8pYFnO%2BPVyB6ZLYcoVYRZxHglZxHsFA8LMThNGtnPjtg4Z4zDCURMCcCLJUYHdMMOLa8Zfoc3h3%2FBmucp7ftaTjrwAN4Ry%2FguxJeOx7e2cH1TZK3vy%2Bwp7Fe3dKphZS3rtVchm%2BKm%2BM3GzvPWRAf%2BxGrbn7dYtGVavatCSMwMqmp7ejeXcdFbFpLQn5gTcwHxT2I9dGezYwL37BSORnpV%2FQG3%2Bh5S3SS0BtSlBXBvWoMqpLprWsPBWcTB47%2B3Rn1FS1udeoZdJkVkaFU8Vj76lHNaSoVbODkU2RCt%2FHvUV2o%2Fx9UbLd%2FRbZSOnt494hvpl%2BQhsWRj0muy3iSwwARZAcdwBFM8wdA%2Bh61wZAyklz3QMKJQpUQ8UURGxNADVfPPcBXS2YYHgEJlCF6gUD9dh4QIfqKZ77gFnYok7VB10bAIqahOoBaa6%2BOwNAaRDPPQBEu7CFGGwNAEU5XBug4IKM7nsAnAvw7IK00a4BBkO1YwMYYs0FlOIK8kHXPcAQayZQNIB%2BuGEoOQx8P8onT8ivmn71x3Z8xf8B%3C%2Fdiagram%3E%3Cdiagram%20id%3D%22FUKPZY9jMT-AHdzH7lH3%22%20name%3D%22Entity-Recognition%22%3E7V3bcqO4Fv0aV%2FV5SBdg8OUxTtIzqXEnOU5nuvupi9iKzTQGH8BJPF9%2FJECAkcAo5mJLmpqaCTJX7aW9pK2lrV7%2Fav3%2Bh2duVl%2FdBbB7mrJ47%2FWve5qm6qM%2B%2FB8q2cUlI0WNSpaetYjL0oJH618QFypx6dZaAH%2FvxMB17cDa7BfOXccB82CvzPQ8923%2FtBfX3n%2FqxlwCouBxbtpk6XdrEaziUnUwTn%2F4E1jLVfzokTaMflib%2BOT4S%2FyVuXDfMkX9m17%2FynPdIPpr%2FX4FbFR7uF6i674U%2FJq8mAecoMoF2vX9wB09%2FfHny%2B7x%2BmK6%2BGv%2B%2FenCiN%2FWD3b4i8ECVkB86HrByl26jmnfpKUTz906C4Buq8Cj9Jyp625goQoL%2FwFBsIutaW4DFxatgrUd%2FwrereAHuvyzER%2F9jG%2BG%2Fr5%2Bzx7s8IETeLvMRejwJ74fOkgvC4%2FwdWQ1xTXnu1tvDkrqBsPN9JYgKKtDLToRVVzmCbEV%2FgDuGsAXgid4wDYD63UfWWYM0GVyXmpD%2BEdsRhaTjrs16ZALm%2BonZVN1pHZrVI0Ho%2Brj0zJqdN9X097GT3rygUfYGfLGBv0ZmM%2BhVX34nUFssj6qOEh9gWk58NKokueubZsb3wpPj0pWlr2Ymjt3G%2BAb4aPJi%2FUOFrOIJ9UQNG9TeDM%2FtsoLvDlGGfrZtK2lA%2F%2BeQyuhJ0484MN3mZp%2BEJ9RaMdX4AXgvbTi41%2B1YcyZuNcwji33llJwcs4qw76aoRQbK37cDHYTTGcJvyh5Xt%2FYf9xAIR5He1o%2F9zDThlXimAGYoIbnEwBJPvTjmNEIzJTjZYZ6HJOV61n%2FIpTYsVWzGAqP36y1bTqwJ2MuckUTd4Fb6Itl21eu7SKgOa4DCKyhkxaeu%2FmGWyIq2LiWE4Q1ZEzgv7DOrpBnMOC7XsFjNT2G%2F6LTveDKdfzAg5hG9wAQWm8AwWsShH4L3dQGL%2Fj%2BXmwQ9PezGwTuuhCIpc3wMDp3%2B2Y%2FBMY8PGpzHH0CBA9%2FFcIAfn9gmXaK%2BtBhoL6ymRqNYllqXSf1m6%2F4vJtwYXW%2B2GF3d2UtFsCpbg%2Btsj0yBugz1j%2FFFzDerYXGrhN23kKCuIV%2FKJ8QWTvb9TMiDOUC3ckJ%2FtMxCDA3ROdO%2FI05t5zlNLpykEOJ0RZK3nuFrVavFTWVbtcCbAzJEZU4gt7prIcjKD2IdjliUB0E7TgHsLDw%2FY4kCKOyMXgniCFh5BfL84M7c43e99Or6c1XJiYI2FqgNz55jmgFGMJxwkhyQuecMO6aE8b8csKosjF45wQ8cZKxsm2KywnVgSEcJ6hkAFKSQtukoGpds4LKEFM8N1pQq9uDe14go4YL%2BMD7l4nlwVeF1IAOA2sNeKYDBkAIxwf9vnT%2Frbt%2Fo2v339e58fYYwNLbX%2FTJIDBYm5Yt4hCAARbi%2BXyl0PDS5zfl80ed%2B3xSTXS2Pl%2BpXP3c%2B3xyIBdKg%2BbBHZ4oFs%2F3V4eHcL5fI7W%2F0vc37PsTXXtnvl8bceP7MYCl77%2FQyLmdjen7b663QG4%2F8vlfni3HDKsjdf49tJ4Cvb%2Fpr3gmAgasCEcEOqkjIJCw9NzthqzrIgeYLMiJ8dHLrnmh1fZA2dfgXqg6pf4NSoVputGQq1RJAd5XgHpS%2FsralHNn7%2FR12pik0V16TIpZvXpbwnIovZot1TFbY4pvbxjE7VX1NNqWKtV41XpdLIptnRV%2FNF9Ow19zk2ykHo8nzbYqNXlJVZBkuk5IQ2q3GdFS0hfT6u2LVbldG%2FCRSr36R%2BnMfEGTb7fLF%2BR47kvXfFGjLEPK9ZJxKSnXi%2BjiNuKKc6CGdpAgHBUkg2tJBR1SAU213SoVYKvzqM9jWBrOPRGQ%2Bryw4V7Dp%2FYEUeexZwoQiA3IYKRkg9bZgCrXbpcOGAKKZ0cH1e3BPR2QAUPgLIQig%2BpgEI4MdCnV7sD307Tarfp%2BnR%2Btti612klVkIy%2B8ax55OjB3Fqb6BZonmDhbmHl8%2Bz0GWAhntOn5fQY2MgGW3jxYBmE9RyV2BYuWYAXNMMfKjIgAcDqR98TX4dPmt388TS9nP36evN1cjN7%2FPP24dfD7PbqBp8IX3ibfwQsS5%2Fywedmnnf9NLv8dnt%2Fx%2FxIdGLm%2B3NtA8IIlWeyGkKOcX%2BDXBOgtIoczhEkrblpX8bFawjtsIm9rawAPMJWgJ745pmbXj71YlXwf0jPRqWgsjx4x1EQOTFxuVhbDumT4o5ELy9rgViY%2F05kLXt9FLVHkc2kZzyiK7FDSioYXRROTkbXQF7fn6xUEpPjBL5aD8thHrBJlB5NIYMz9oYdHNNfJQYl1DWkhdmTHur7CihKzkNVoZh60JSpMYayQ5D3AITeTaGmqswzQ8WGts8ges6eGqXthYQVGSzDbJ4bmFmmQ3TYY1M2jStbrVhZQrVSY31Cg5wlmFrPnulZpmyURzfKvnFqjZKcDeC9URrVrXYyjZIM5kfKUdkij22R%2BuDUWiQZmOe%2BRVYfpZ1Ki1QpCkzCME2L3Mc5NtFI7FLXBDQH3jFJJzMAMftqBpbrhCO2L%2FC%2F300rsC3Y4kujjjS3dGKi94oAT9FS2S%2BhYGbWtrTlC%2F0xaVtWyTteL4HX8CYNjNLCBqcRuBiTbFgOJFHD1wwITRruURp4GiCbSz9IEiVPGvixjGgnVUFGtL2UVaQInhEuJZFuhbEBH4h0V7ldG%2FhhyF4tNGEwBJfZCYMmgm%2BXMMilNByJ4MfVu5jc8wW56CUWwYdUcQ7M0A4QxGMChpzVkgmaYgKaBr5VJkhiRZxSQfVpJ96pQFXI%2Baxn1%2F0tBhNUx4FwTKAqZKhSUkHrVEAVwLfMBQzhxHNjghTlkgpUhQwYho33m7UWRgXPAggBOWEsKaB9CqDp4NulAJzciQuPLzv%2FqV3Jzj9wFmL5ezkGKMEHbfFjbRL4x5vZ33sSdGhZZw9og%2F9tXfTDszn%2FvQy1VRfzCEmX6N0dC6EveoX4THx3mrw9uj0pZhdL9c6itTgklNEbYxzjJOVDFP0QNUXmqDkmJudopq6ZKocmrudBR1jaS%2BvxoxsyPoZlQ%2FmsZP%2FpU2yoNWdDmXOsdn1O2jCOTFJ5EBgN9rLJyReeBDuqTEOW2QSQnGCxoR%2BXWh1WpJQuSz2qMR%2Foo3%2Fg7q0AS2Yxqz1m8wFyoWe07JBcMAz4nNFVGRa28M8t5ISNQPIeFiiISx6jb%2Bv%2FPaveN%2F%2B%2Fs6f1V%2FDj8eLNx9vrSKYoYgpKTKEqeTCJfVpiCioIzpknDtinGPRcswT1s0mOAOuN7e4A4IElagSCuBxRQK8yMeYpDDAKMmN2OcIgJ4vOhzkqdCtlssy0LsjZGWFEoyxAkNyRq7oKO99J7mieO%2BiZNbvkDoYpsfNjDrlvaloX5BwXkhnd%2Bv4WLHqiiI7q2R1VSAoxJGN0wRijU2MMnBOJB4JIksxJglAp6b0QJcxAsPWcfYroRZPjpo2qXVPunqZTrlmDASaSNXJV16CQdXp%2FeVdTNmXrBT4gB3fLDwFthV%2BJMI6qzkG%2F5B4ML9z5IZB8P7zyxYMY1ZRgBeK7xr2sWDyLPgi6sHCHCwegFuQ%2B%2FwPNiu4MS78AQDSmc5K5MkgDdwl4P0RyZRnFjiM5zLpdqmBVrZ%2FLtEaTwVLT6DXH%2FgNKFt4CzPIqfU2wUZkN8Cqekox5NDOWZsw70owaYUbZuz9WCTuorn8oUcLSkNBgeyanI7mSviZAlz18dUD28O3Id0v1KytYSvr5aq3gqXS7VtDDsB%2Bf0JTB0ldmpwyavrVlyiDnIHmabk5wLhlDHZDThuliiXNgh5aAICAbyKV0p8AGNA1ry2zAkLjw%2FLhALpxL6mJIhsRQ3HMa79TLPRvUsjKOUzYYyrVvp8AGVGlqu3QwZAgsnh0dDKtbhH86IAOHgQtb8oOoO%2FqyoENAhhhKQuiAEGh605YJYcSR%2F5d60rQu6HrSB3MntlaIASMCskCTaqDLbze%2FvtzcRPu5%2F3q4mf26vvwpcLq5j%2BsUuss%2BN64wkGxad2PkNl69oIyqqHINfF391YJ3TM%2FUAlgsAZ73hD2Rlbt0HdO%2BSUtzqEnPmbqht0Tg%2FQcEwS7uXqHZ331og3cr%2BJH5%2Bye61WfNiA%2Bv3zHDogPc94L28HY%2FsgfRZQY%2BTC8Lj3aMqMYI8d2tNwclZ2I9a4D7eMUNJToR1WhpK%2FGAbQbWK9gDVwPaM9JJkvkhjndEiRCqBVc0Zu%2B50kRStEbXWJvDoXUxzfC%2BX%2BWdWWFEdjPFtULZqK5Nq2iUvWtap%2BlhLkmsSulHJ424HbCq%2BunQdKcsnQCkPpbGm8fVx9LhpZeeZ%2B4yJ8RBoPTOD6ggy0tZmBz4Gf4R3b%2FeURRlm%2Bm78%2FaJqUOpPlYZdu4EK0x1tD1WUQ0Vb8%2BejRmNKBUDiz83N2A5IU847NgVYlTUN2DBYOnKF%2BJuyXi%2FX6LEeCKcY8H58J%2F9K5ryl2RDPXt%2FiT%2BpepRxkKt8ZUTxFC17UO6GWCyG6a7aSVWnbA8n0BoqSCqb7k%2BM1Fx%2FYqgTtTKkdiaaqxZSbn72aK2uJUu9dcfopOxY1Tk6dUqtqLQJUrzzTgPoJONT545OlT1Y2zU2yX6EQEbAv%2BZWGQ%2B6NkqF9WLNL6FX9j1GXyP5jKqoUEsGS0cKYk5oaNztyBgj5ODIONmW5PDQGMdDTmUyb0zyw7kPcZKGfcpDHDJEKlC109NOaOPOKYG2t2Aku1mpiY7HevZMb3fx1XTMJVjDWrl43PkBWGcUOunZuHBhveaL0MrwPYPjrSrRDxd%2B6ClRQh51vHnv0bayvHECK0D1OQNzd4n2vHSdzEtE9yfUQ5Q3aeLlrkwfKaIeg%2B1ix%2FhStTWDWDnXi1bex0ffQkZCohk6%2BmniukMtgrkzpO9DP91IOcv7VBEPjknVvr1Dp7SfiYL%2FzPzUBO%2FnmJdqyMOxcI0kfJa9A5oNfOv9fXjhaeaiwPdAM446v6%2BWnz%2FqH3n%2BgfcZ59%2BH8XxdqXdalIqEc1NNHdgp44B%2F62v7iBrQ5v2aYndq%2FZ9bmO6o%2BidaxIgcV7YrlDLI6LEfmMEWJSYEznYddiei%2FsCzl%2B8hlImvL%2F%2B%2BvJ1eTqY3pbLptGRyP5vdf7%2BBL6D0wp2Rbx8fn9Bhpavv7u8uqj3xHIXazP2YQS7iaYzJVq7SZvcHNXRjCqb2yTAO9%2FGLqt0WvEKrwhS%2BTu0tdRan0EmylFZltSoO9nSsy8hPk%2FTj9yrsDo6OOx%2BHNBtVcQzIGP%2FEdX8TqD3%2FrKPMJJGQArafQckTS%2BuNJIW1%2BxNKmthyS4m6%2Fpchv2jSAo5KL0rDQWOrfylpZnnKLsqwIJv39cCUPLLpxmSiJxZlwEnxmmDqWoaP46bS7doAjtzVsvZMEexMQcsq2i5TcL2HZQJySRSU7LFvrifGDpYMMBCOByjpBSUPtM4DtHyirfIAJZMgRzwwrG4Q3nmAkihws322LX8VjhI%2BvZrefGXiAQNsM9AL88wNDNAQjhtGkgrapwJqMtFWuWDEz06TGMHS8V%2BMyAH%2FDpje%2FctD5P6RoEyQ7YgZUCGcz8f5BaXPb9Pn0zLLtOvzFW58fpIhU%2Fr8ETmqu32c3AnZz6%2BOCuF8%2Fqg4V7D0%2BY35fNoO8%2B36%2FGKqPzefP5IbxiRiKDKgmwhSPyFFKs9engEHPHt5%2BpINsjPw3fV4UXIdJSvv52T9elXfXMtW0XRrkXFaSdLlSq4DEChpFCeh5KK%2F31nvE%2F0hi2jc8zb9u8n4XDpBz7mSq06ciMfrcoNo1uFcA0zRppKL%2Fn60Rf7nMbz7kDkMQWmCTCIYWEH4srzF9OqEhXisIDeKPgFWaFPXRX8%2FMg%2FS%2Bei6PmSQkZi8gFGVMTQcNMDmLImhFBfCEQN%2BpOSBFnmgVVEX3eznLPD9iEWimhSPCHAoO2PoOXzg0g2%2FXlJBMTLEo4JioaekgsaooE2tF93sZEo8nvx%2BX1C%2FT4aBF8Cfe9Ymyp%2BpfApzM4ns9wuQIZ7fJ4U%2FJ5p0KHpP1tSWpRPqB7MJRatFSZjUnhGKnq6UHMc%2FpOuzyti6J4RUY5TbfnLQp%2BRfpEo16kjNRjeZTLrThlRDL%2Bi2n4pUAyfoE0eqofMvsaR%2FNynKSdbQSr0GI1iE633pMvNOG8PwA3TRuV5DZ5DtcDAs1wt61dxzBSnLccy1lGuUo0I8UiBlPZIUWieFzuUaOoNqhwdSGApKCqQqZx5teSRJoRgVwpECnimSHNAiB3Qv1TDIPQE48vmGoLoMvLVW1ufDhwVSlnEAGOK5%2FQFh%2BDa3rOt9YE8QtfeBPUFqmdbDky8Hp%2FWGBfBqZ1rPIMd3V4kqq4zje0LM6uGeDg7OGVUn9RrbNpKyr5fsjNU%2FqWcU9PVPZVLPIEdqnE%2FqGYIuoKBsdIR1s3JOjxErwnXZ5L5LFdniuKH7AbbofE6Psu9Sxw6i0aH8QFD9B2XTJTmndxAVwpECZWuNy3hJphzx5UZ8Ot7D8%2BCIrzHnTdkCQ3J4%2FSO%2BojjMqYz4KBtkcD7iGwpK40OSxqMl83K8x4gU8ahdajjbGO8d4IrOx3tDsTScQ0E1nENSw%2FlieX5wJwd9h6AhHjMMJRG0TgSd6zaHxTso8OD3BZVpDsnJP9uUbr8CMoRz%2B5T9k050SX2i2UkOWtfsYG1FVrPDlKmnHc0O3j1J2rSCTXH09KBNixLxtWRTMrpHWjlMlLJnFOjc3d8g55kpzpoInSOnas1N%2BzL%2BYQ19boiTt5UVgEfontEz3zxzQ2Cnklc%2BkCyhn0uWYFCi7LQgu9FU9ZMhtzt%2Bq9%2FAsWQ8yYFzdHdW%2FWTYiuPq1%2FAEXFz9Bo7OdFb9ZLiI4%2Brvq%2FvoNwZ6x9VPhnG4rn593%2FfjW3RW%2FaQEmuPqzzufoaJ9poiaWzUAKWnm2AAjbR%2F%2Fut5134eMJnDc9TTweifs%2FZVhU9UPDz3XDbIDevhRq6%2FuAqAz%2Fg8%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)  
[![Draw.io - Entity Recognition Case Study](https://user-images.githubusercontent.com/92815435/199235373-32d58af5-d68d-4004-bff2-4b7697135eac.png "Draw.io - Entity Recognition Case Study")](https://viewer.diagrams.net/?tags=%7B%7D&highlight=0000ff&edit=_blank&layers=1&nav=1&page-id=FUKPZY9jMT-AHdzH7lH3&title=Library-Management-System.drawio#R%3Cmxfile%20pages%3D%222%22%3E%3Cdiagram%20id%3D%22SNOo6PtL7Mm3kq7FhRa3%22%20name%3D%22Database-Model%22%3E7V1rc6O4Ev01rtr7IVPmZeyPk9femckkqck89n4kMbGZYPACTuz59VfYgDHdyBCwsCVtTdUaggGrj%2FpI3UetnnYxW%2F4dWPPpV39suz21P172tMueqirDoUn%2BF59ZJWdUvb85MwmccXJue%2BLB%2BWMnJ9PLFs7YDncujHzfjZz57skn3%2FPsp2jnnBUE%2FtvuZc%2B%2Bu%2FvUuTWxwYmHJ8uFZ38542ianFUGo%2B0f%2Fms7k2ny6KGa%2FOKZlV6c%2FJJwao39t9wp7aqnXQS%2BH20%2BzZYXthu3Xtoum%2B9dl%2Fw1e7HA9qIqXwgWb3Mz1H9efb69Cv83XPxefvx8pm%2Fu8mq5i%2BQH%2FwjtIHnhaJW2Ann3efwxsh7jU%2BdhZAVRYiytT06Q5o8sxyNf1S6V9bHrWvPQWV%2B%2BOTN13PGNtfIXUXqj9Oj82Vna428bW8XXErPdkJvFh%2FHNn8nNH5KXif9suc7EI5%2BfyC%2BPn3ge2CF5lxsrjJIrYNskzfVqB5G9zJ1K2upv25%2FZUbAilyR%2FNROzJcDVB8nx2xYF2TXTHADUYXLSSpA3yW6dPe0bQarlTcgPyh6nGTuPU5DHYU%2FTCg%2BzXNIinhXZ5%2F7CG4d5QJAPud%2B5PbWGSQ3IGAAydLh8i0F%2FPvUD508MEjcxah5C6%2BM3Z%2BZaHulM1rhw6txfu481FBzXvfBdP8aZ53s2gFp80Tjw59%2BtYGJHyYm573jRuoWMc%2FKPtNlF%2F4PRM8i7XpBjZXtM%2FsWXB9GF74VRQCAd38MmyHqzY3SdR%2F48ualrP6f3DxKDxJ8f%2FSjyZ6U4pPbC%2FeBc7Zp9HxiL8MhjcQcXdUEwACC4%2F1IKA%2FL7I8dyt6hf%2B4vYXVtboyGWRds6a99iwxe9hE%2Ba89lde9ypMx7bXnV7GJXtkTOAVrP9EV9Q824MOrsJ7Lwg%2FPCJfOj%2FZS0i31vMHmO%2B6J%2FFd%2FKi%2F3QMgpQaNteeh3PryfEmN5tvDgooMVihZNkr7bV6q6ipdLt2YTP%2B9Ofq9%2BRhqb98N7Sru5%2B2Fr6eDSUlYJTQPyAlVB2ftEEJqM1HwFVcd00J9thJ71edEWiAFosR0JZIJ2Y5Owe%2Ba28o4RQYgAkKePb4qL8aAlRICmBNAaOuZwWQAk6RAKj4FooA0JZACODZCcLo1prFL%2FzXqxU8Ta10TkC6C3G%2FnJBCQ2QIRwqKAqAiWYE1Kyhq17SgqPzyglI9sMw9MWjAzK4lLi%2FUQIZ4xADzTpIYmBOD0Tkx1MglnRwxVLcH98QAs0Vj8sC753MnIK9KuCE%2BjJyZzTUfVAeEeHxgSvfP3P0PO3f%2F5Wmik%2FP2ZuXm597bwyigPbMcV8g5QHVYCOfzM12c9PnMfH4mq%2BzM56dCPA58fgpg6fPP0nlbzuevFaFP0W0qEBLO99eAh3i%2BX5O%2Bn7nv1zv3%2FTo%2Fvl%2Br3Pzc%2B34YxJtbYfjmB%2BPY7W98%2FvWj41nr5tg6%2F168lCN%2Bfyucck0E1bEiHBFk6xx2QsADNzbClDTSYBJ%2FunEeA4Kes6%2BWZ03sGWnus4dVGNmz9FLy7O3V6cmx81o8Rezq7cBs8O8iXn%2BzlgWfhWtm%2BUguUEbz5eZryd%2FTG11aBHZWGLdmstgpe4HNvXefR07vvEUB4wQO6x8azdzEJZGe4b%2FYBSgj6E4A2tuImJOj72vIxwMP7fxt6kT2AzkfP%2BotsOYlGA5i09ope0JE105ipcMeSpJBw8BHWzbTiHWGUJp27vsv9AFIYbDB6RonRdF2raVhEjIVsVZ2sn1z1RCRCT1WrLG%2BaFhdo0RZYITh4HBSQsgLPK0wylAux48jKBJ7JP5ZrjGqiZPysaMyahU3lW7HAjgw6CSZomFUoT5TYOuO2DIFlJ2d5sIjOsglUYygaOzND154W3nUFAbi8YBce3QEPFB15ng4HuBlASod5JIHlD6cG84Xj64TTsXMNNbAhnDkoPTLBQeSDA5FBuiaI6ZsoPTLBwGn5vszDEvnT9oCTvdWthXcPd9vKGCTWBRDUV4DFwI6%2FnK1gXT8B3P82Joixo7f4Mjxy0VE27aAq4g%2BPZzfijjgr4ML8Ry%2FIsWFHTh%2BbDURW8ev8CMvzDAsHT9pCygwJH01WoSx67e9xYxrV18DCcK5egNKB77ZoR28WpHjx0K%2F%2BIlq%2F5flRGRqGNFpoSeE5EtPtXe0FUEGYt5MqVmvrvVAU3aep%2FURdA6OBE4qgJMcSTSUnhnVEUqRnmGAPNhAwoARJp6kZxnK5dDCgIqCYMsfUoFWEy6U1Qt1ZwJ0%2BFS6HQv8yL0QWp961icMTIHGljBgZIoj5YEhd0PImgJuhzCzY2oQQoNWAwjCMcFAVjo9AibANGhMmWBQYwZ5ajwwkCKErCngDHHdcb87m1KnIogPasBBPDaQ0gP2zh%2FVnLH1%2FvwoDwZSeJA1BZzd2d5YKFffSuXSk3f1S1u%2FOo8mvnZ3eXe3ePDMwPuRboSYs7s9nthp7I14zak%2F8T3LvdqeLdRc2F5z469NHnfd33YUrRIqiCOQvZ0qEfbSif7Jff5ffKsPRnJ0uUzdQXyQ0gQxcbD6J3%2BQ%2B1Z8uP3a%2BiijlziUuHkRZYRiJhVY%2B4vgyabAKPGOUUpDpdclF8YNSQVbYLtW5LzaO6%2FRxKujFoalaaWFG1rY1LqyMO7f4MqhG9%2Fa5o%2BJAQPiOKlDup6Q2WMdT9Z96Of%2F06CjpiaTG9kyLWgmAzHt5XCz%2FtEwh7sXFgcbmZswPMdTSjcDvRytmzAC5xJfLnO5NXFCHcg36sh7x%2FW1784CVjDiJ2mlYYinPq3gmd4OaQXqRzhK%2FJpSg5w1BRR6CJT4rQEEcWnj8vPly%2F3w0Zn9ur25evhx5y29izN1JFmCzhIAU5WJo2YWmAlLoCDQ4JT0dFhij30oqOeaJXBDw1mmPZu7%2Fsq2eeCJNqEgLk%2FgDCuL3h7B9KIkg9zd%2FGIImeNUeGP%2FoFJWwM3MDHkjTit%2FCsOFPe4JkmSugQdJHoUlokj%2Bijzx2rbpJNITImdlplGjNIiErXjEdiTIVrm2v1RdreHYheb7GlmqbTdolKaqu89KQyDwnZhS5B55ubZAUlMbNy2zU3XBQhkCKK2Cp9LtmKBHZqBanyK%2BgzKwFBRjyuA66aTInfVybQHTTrGY4dImQ3Q35CGm2CoeBCQFqE2XpMCeFLCME2NSgCuTOaKEQWWD8E8JcLOLsbUK43iPEGxQHQoCsoHMIh0DG6BpJLZ0gEgOOKIDmTnaGhrGDyOf9OT7wHnarE%2B0n5yZ5SYRpbG%2FIDbgmyFaySNxyhCaJIQuCAEris%2BYEMprYp%2Bc%2F09BLP0%2FaQsYDIzFAvfWalc5kPh%2Fy43bXO3f%2Fri54ZoFamCEZxZAFzQrMA%2BVq5qcBBd76eLX3J%2FCc99%2FCekM0jt%2BTUF%2BvbOKYqq%2BxiD18LSqyiZi%2Fmwvu3pVlU1z93lmxcd1gTaZt6o%2BBtkPTXqPbqR8qAKY1qoqKJC4YuHDxfWX8v36jkf%2B8F47vSu31W7tfval%2B%2FGmgKktUHr5FIKZVfQPh0fLcte2%2Bdr6w1bRU%2Bl2LOAjE1%2FVBXTMWAUTR7BlFZgGS1il6%2FjnIVnlXekxPlkFZsceyZxF0kk9mAhHJzp0D7LI154NIfJVvqjjF%2FZVvn5anw3lXlPPRsrVxdJRHy%2F%2B%2FXwGMyU3Wy1VFu6Iz3ES5yg18fvjGjqye1P93aIamREGr%2BTAr%2FrKCWrPOMotmtA35maHJirEhcpvoC0Bg0RA%2FyrQqomGYOG5Ni%2FaNHJ3pibZ73aoguXmTOgb87I3ExXhkilg4Gdb9vEUGIEJCIRjABgOkgzAmgFYbsqEvjFURXPEAMPK5uCdAVLJxcnGfpmgQDgKUOD%2BDdLlH9jlM92KCX%2FlITcePstpShePFDqKBa7f7GgReAXB64Xa%2B9jvcSt7bQoV4XggfQ0xUnxUXeveFF%2Bq2cin%2BGhTzyPZxwdZBP11XaU7nDpz%2Biigd%2FzpvHS4Ed%2Bl116GryBc1nXoEFDhMq04GuIRkvune3vlNQBHsjgKWVktR44Na7Kp1QmpA2Ey%2FspwjHGiuUU6yoUaTaJNgSySnmV0IVxysSlaKAPKuksd9wwoq9yOBXygoEjyRcPFtfX5gqXkGIeBCmBwmuFlOsglXWhQdJTsAcRbiLkpEsSjAqhTklTAnAqwRCNbKqghODo5Iqi%2BBzz3RAAlReuOe5nUYBNht4YacBCPDWrUYpRscCg2QHOQbOmgRkDx5OhAyKQk3hQwYGh7Y6HIoJW0I59kkL6G9P0sfT9WcI2p79e7rmLSnqtPESxdfbZMOOfq56IW2qwBC56d%2FtBStFfjj%2FHv7G%2FP%2FhL%2BWD7%2B9JGlxtAdkEaLbZLTihCP6r%2FYBYMjGABSgdgEzpPlfkz%2BMCOmXEPqbepE9gOxevzMt8Ca94qSFmjs2mE%2BpZ8m8NOQPBaIwSQERnPnO%2F705%2Br35GGpv3w3tKu7n7YWvorW%2FP3d5texfsay%2BSsEQyekGebVf7za33WOveQH7XU1magAqlowV6H2D1V8QIUqZIbqs1Ri1q36jAaW%2FVUnNtflFWnUNEV7krT1Vz8GgbXKXZCMmbd3vo9PbBGXIum65O9J59tCavOA97IQ2rRwsHI6bpDqWCr7RnXXDSjDQbeeEWYQRbMIVheV6dAAjg2%2B%2Ba4ti73EjFjoLgNErFllO3RqTdtm1oMujW44UaMrOCLoPaJh9ZdG%2B243QwU31WDooBcq%2FoI3BZxaBMR7C6fVbIoT6uKfRh15T3zmHXdnAStZKKZJ0L4lWsErxXRIKzVKDB9xTJ%2BOeMkpSMlgz1pvmPLXqxU8Ta2UTkjfIb776BmFDSokg%2ByGWuA8%2FtjDe0rb4T1kcSl1nJIP5aEXJvIZ9otLcROfcjitvnZb340F6EPzAxINYBm6UeE075ZfA%2BiFpJo6GHbc%2FHCQzDH%2Bsxxmti6648AlstM7x%2Bg31e6a%2F%2FLz5cv98NGZ%2Fbq9uXr4cectvYszJRV9HwHDU%2Fkd5cz3EXWas8wTNdo4myXTzFJsqYcs5L2N%2Fk5Obf%2F1GoscHJxdcOw1i6OG1CTdeU0owebYaxbHDN03P5RGc4z%2B4phBxyJaTNPNsMABx%2Bgvjhm6b34ZFKhccWo4gmMN6i5GXel7UigqBYlZqrorG30ofbPhF9Qhg%2FFKuq5PYvZ9mKVVZxUPsoUh%2BYEga3QJ2XcV9mMBWdpmIXtVlEoabOsas%2F1iHFKnT%2FLAFwZMvKZQwRmlX3AknccmkRXXHM8zFKUwz9MVpGgj0%2FaH02yh2r%2FrFRfIEmSu%2Fc%2BxxTl0ONHmGP%2FFQKrZefPD1BTH8NcKe3IanedGQOv%2F8oMXYIDTVNQja9GA9co9VbGrZLbbVyBdaUPWhidrgLXolhJV61gZAuV9olTq2EbV%2FUYgOGnF%2FHvsoeL24EjciP5sqJd%2FI65ZCL18iygpFztmVfDbQU2l2zGAjdTD19XDt88RWPaKKUecrvz9PcYwxCQIGDiLnMjlUf3eIiiE44M0GyD9Pzv%2FjxXRYer%2FVZgK5sjfbyAtnsNHZNxjO3wKnHnk%2BF7s99eBMoGdfhkyhPP6yM4W94tH1wmn8ZRRRveAoGKARWLR6N7gUE4b2aRCUnf74T2tJFJwNPE9GPjhPMCnCcrnyJ4T89RJyzhfTbCIR%2FE1gjxC00Wzmd4euug81FdnxwoO5n4b1AvIFVCmxWmpizZRIR4pQDWZJAXmpNB5%2FA8RtXFNCiWLmHknBR3Kt56caCVJgYoK4UhBlxzAngPQPczYkkB55o8Dn6%2BXND%2F3Ph%2BGB5%2FIwzY%2FXrr9cmAI5%2FYHuLg7%2FLiIiK8%2F%2FbLp%2BNLKhqLvgkBfxbw4thsZtXA6gpe08EFh1a1Z8XFdwEkFcJLDirJhxbuwSenFtdJVh9otD38%2FXI9%2Bcf0FLqM6vqRVi3baPx5pl2aOhWVoOnVe0lWHh8ly16j54cSw3dFJlduxwI0UqldXOzCjEyydxZZOYFYzoZOuI5iM6WS%2FqJ1POoHpTGs9X5GEUg8o4hEKzJCup7sX5KkTwhocbBR2kBnvYHcGii5JF3TGK5Opncx4h9QhSucz3vRhws9492dduRyimDCuKme89WEi3ADFlAHUTma8dDrpfMZrlgZQxZrxmoIGUE0kobuZsqwkpdSDiniUAoOoyXR3RaeWE5jsVoLHvsltodogui02usqvjX2wcZPJZRvVRwENXERJWOxYVvmZMM7J%2BSo%2FU9CVGyaMS%2B7yu1zkVxkrwmm4TBmCZKHl3cMWnS%2FyS4ebgqznMAVdzzGEkUW5yG8vKoQjhRGEyUbTS6eGAg3onM75lKKEV%2Blj2x%2Bzrdw8krFfFrO%2BEV3dVLXGz%2BFgIFzx5tH%2BqC6XVD6CUd28jknO%2BSojRTx6l8pYFnO%2BPVyB6ZLYcoVYRZxHglZxHsFA8LMThNGtnPjtg4Z4zDCURMCcCLJUYHdMMOLa8Zfoc3h3%2FBmucp7ftaTjrwAN4Ry%2FguxJeOx7e2cH1TZK3vy%2Bwp7Fe3dKphZS3rtVchm%2BKm%2BM3GzvPWRAf%2BxGrbn7dYtGVavatCSMwMqmp7ejeXcdFbFpLQn5gTcwHxT2I9dGezYwL37BSORnpV%2FQG3%2Bh5S3SS0BtSlBXBvWoMqpLprWsPBWcTB47%2B3Rn1FS1udeoZdJkVkaFU8Vj76lHNaSoVbODkU2RCt%2FHvUV2o%2Fx9UbLd%2FRbZSOnt494hvpl%2BQhsWRj0muy3iSwwARZAcdwBFM8wdA%2Bh61wZAyklz3QMKJQpUQ8UURGxNADVfPPcBXS2YYHgEJlCF6gUD9dh4QIfqKZ77gFnYok7VB10bAIqahOoBaa6%2BOwNAaRDPPQBEu7CFGGwNAEU5XBug4IKM7nsAnAvw7IK00a4BBkO1YwMYYs0FlOIK8kHXPcAQayZQNIB%2BuGEoOQx8P8onT8ivmn71x3Z8xf8B%3C%2Fdiagram%3E%3Cdiagram%20id%3D%22FUKPZY9jMT-AHdzH7lH3%22%20name%3D%22Entity-Recognition%22%3E7V3bcqO4Fv0aV%2FV5SBdg8OUxTtIzqXEnOU5nuvupi9iKzTQGH8BJPF9%2FJECAkcAo5mJLmpqaCTJX7aW9pK2lrV7%2Fav3%2Bh2duVl%2FdBbB7mrJ47%2FWve5qm6qM%2B%2FB8q2cUlI0WNSpaetYjL0oJH618QFypx6dZaAH%2FvxMB17cDa7BfOXccB82CvzPQ8923%2FtBfX3n%2FqxlwCouBxbtpk6XdrEaziUnUwTn%2F4E1jLVfzokTaMflib%2BOT4S%2FyVuXDfMkX9m17%2FynPdIPpr%2FX4FbFR7uF6i674U%2FJq8mAecoMoF2vX9wB09%2FfHny%2B7x%2BmK6%2BGv%2B%2FenCiN%2FWD3b4i8ECVkB86HrByl26jmnfpKUTz906C4Buq8Cj9Jyp625goQoL%2FwFBsIutaW4DFxatgrUd%2FwrereAHuvyzER%2F9jG%2BG%2Fr5%2Bzx7s8IETeLvMRejwJ74fOkgvC4%2FwdWQ1xTXnu1tvDkrqBsPN9JYgKKtDLToRVVzmCbEV%2FgDuGsAXgid4wDYD63UfWWYM0GVyXmpD%2BEdsRhaTjrs16ZALm%2BonZVN1pHZrVI0Ho%2Brj0zJqdN9X097GT3rygUfYGfLGBv0ZmM%2BhVX34nUFssj6qOEh9gWk58NKokueubZsb3wpPj0pWlr2Ymjt3G%2BAb4aPJi%2FUOFrOIJ9UQNG9TeDM%2FtsoLvDlGGfrZtK2lA%2F%2BeQyuhJ0484MN3mZp%2BEJ9RaMdX4AXgvbTi41%2B1YcyZuNcwji33llJwcs4qw76aoRQbK37cDHYTTGcJvyh5Xt%2FYf9xAIR5He1o%2F9zDThlXimAGYoIbnEwBJPvTjmNEIzJTjZYZ6HJOV61n%2FIpTYsVWzGAqP36y1bTqwJ2MuckUTd4Fb6Itl21eu7SKgOa4DCKyhkxaeu%2FmGWyIq2LiWE4Q1ZEzgv7DOrpBnMOC7XsFjNT2G%2F6LTveDKdfzAg5hG9wAQWm8AwWsShH4L3dQGL%2Fj%2BXmwQ9PezGwTuuhCIpc3wMDp3%2B2Y%2FBMY8PGpzHH0CBA9%2FFcIAfn9gmXaK%2BtBhoL6ymRqNYllqXSf1m6%2F4vJtwYXW%2B2GF3d2UtFsCpbg%2Btsj0yBugz1j%2FFFzDerYXGrhN23kKCuIV%2FKJ8QWTvb9TMiDOUC3ckJ%2FtMxCDA3ROdO%2FI05t5zlNLpykEOJ0RZK3nuFrVavFTWVbtcCbAzJEZU4gt7prIcjKD2IdjliUB0E7TgHsLDw%2FY4kCKOyMXgniCFh5BfL84M7c43e99Or6c1XJiYI2FqgNz55jmgFGMJxwkhyQuecMO6aE8b8csKosjF45wQ8cZKxsm2KywnVgSEcJ6hkAFKSQtukoGpds4LKEFM8N1pQq9uDe14go4YL%2BMD7l4nlwVeF1IAOA2sNeKYDBkAIxwf9vnT%2Frbt%2Fo2v339e58fYYwNLbX%2FTJIDBYm5Yt4hCAARbi%2BXyl0PDS5zfl80ed%2B3xSTXS2Pl%2BpXP3c%2B3xyIBdKg%2BbBHZ4oFs%2F3V4eHcL5fI7W%2F0vc37PsTXXtnvl8bceP7MYCl77%2FQyLmdjen7b663QG4%2F8vlfni3HDKsjdf49tJ4Cvb%2Fpr3gmAgasCEcEOqkjIJCw9NzthqzrIgeYLMiJ8dHLrnmh1fZA2dfgXqg6pf4NSoVputGQq1RJAd5XgHpS%2FsralHNn7%2FR12pik0V16TIpZvXpbwnIovZot1TFbY4pvbxjE7VX1NNqWKtV41XpdLIptnRV%2FNF9Ow19zk2ykHo8nzbYqNXlJVZBkuk5IQ2q3GdFS0hfT6u2LVbldG%2FCRSr36R%2BnMfEGTb7fLF%2BR47kvXfFGjLEPK9ZJxKSnXi%2BjiNuKKc6CGdpAgHBUkg2tJBR1SAU213SoVYKvzqM9jWBrOPRGQ%2Bryw4V7Dp%2FYEUeexZwoQiA3IYKRkg9bZgCrXbpcOGAKKZ0cH1e3BPR2QAUPgLIQig%2BpgEI4MdCnV7sD307Tarfp%2BnR%2Btti612klVkIy%2B8ax55OjB3Fqb6BZonmDhbmHl8%2Bz0GWAhntOn5fQY2MgGW3jxYBmE9RyV2BYuWYAXNMMfKjIgAcDqR98TX4dPmt388TS9nP36evN1cjN7%2FPP24dfD7PbqBp8IX3ibfwQsS5%2Fywedmnnf9NLv8dnt%2Fx%2FxIdGLm%2B3NtA8IIlWeyGkKOcX%2BDXBOgtIoczhEkrblpX8bFawjtsIm9rawAPMJWgJ745pmbXj71YlXwf0jPRqWgsjx4x1EQOTFxuVhbDumT4o5ELy9rgViY%2F05kLXt9FLVHkc2kZzyiK7FDSioYXRROTkbXQF7fn6xUEpPjBL5aD8thHrBJlB5NIYMz9oYdHNNfJQYl1DWkhdmTHur7CihKzkNVoZh60JSpMYayQ5D3AITeTaGmqswzQ8WGts8ges6eGqXthYQVGSzDbJ4bmFmmQ3TYY1M2jStbrVhZQrVSY31Cg5wlmFrPnulZpmyURzfKvnFqjZKcDeC9URrVrXYyjZIM5kfKUdkij22R%2BuDUWiQZmOe%2BRVYfpZ1Ki1QpCkzCME2L3Mc5NtFI7FLXBDQH3jFJJzMAMftqBpbrhCO2L%2FC%2F300rsC3Y4kujjjS3dGKi94oAT9FS2S%2BhYGbWtrTlC%2F0xaVtWyTteL4HX8CYNjNLCBqcRuBiTbFgOJFHD1wwITRruURp4GiCbSz9IEiVPGvixjGgnVUFGtL2UVaQInhEuJZFuhbEBH4h0V7ldG%2FhhyF4tNGEwBJfZCYMmgm%2BXMMilNByJ4MfVu5jc8wW56CUWwYdUcQ7M0A4QxGMChpzVkgmaYgKaBr5VJkhiRZxSQfVpJ96pQFXI%2Baxn1%2F0tBhNUx4FwTKAqZKhSUkHrVEAVwLfMBQzhxHNjghTlkgpUhQwYho33m7UWRgXPAggBOWEsKaB9CqDp4NulAJzciQuPLzv%2FqV3Jzj9wFmL5ezkGKMEHbfFjbRL4x5vZ33sSdGhZZw9og%2F9tXfTDszn%2FvQy1VRfzCEmX6N0dC6EveoX4THx3mrw9uj0pZhdL9c6itTgklNEbYxzjJOVDFP0QNUXmqDkmJudopq6ZKocmrudBR1jaS%2BvxoxsyPoZlQ%2FmsZP%2FpU2yoNWdDmXOsdn1O2jCOTFJ5EBgN9rLJyReeBDuqTEOW2QSQnGCxoR%2BXWh1WpJQuSz2qMR%2Foo3%2Fg7q0AS2Yxqz1m8wFyoWe07JBcMAz4nNFVGRa28M8t5ISNQPIeFiiISx6jb%2Bv%2FPaveN%2F%2B%2Fs6f1V%2FDj8eLNx9vrSKYoYgpKTKEqeTCJfVpiCioIzpknDtinGPRcswT1s0mOAOuN7e4A4IElagSCuBxRQK8yMeYpDDAKMmN2OcIgJ4vOhzkqdCtlssy0LsjZGWFEoyxAkNyRq7oKO99J7mieO%2BiZNbvkDoYpsfNjDrlvaloX5BwXkhnd%2Bv4WLHqiiI7q2R1VSAoxJGN0wRijU2MMnBOJB4JIksxJglAp6b0QJcxAsPWcfYroRZPjpo2qXVPunqZTrlmDASaSNXJV16CQdXp%2FeVdTNmXrBT4gB3fLDwFthV%2BJMI6qzkG%2F5B4ML9z5IZB8P7zyxYMY1ZRgBeK7xr2sWDyLPgi6sHCHCwegFuQ%2B%2FwPNiu4MS78AQDSmc5K5MkgDdwl4P0RyZRnFjiM5zLpdqmBVrZ%2FLtEaTwVLT6DXH%2FgNKFt4CzPIqfU2wUZkN8Cqekox5NDOWZsw70owaYUbZuz9WCTuorn8oUcLSkNBgeyanI7mSviZAlz18dUD28O3Id0v1KytYSvr5aq3gqXS7VtDDsB%2Bf0JTB0ldmpwyavrVlyiDnIHmabk5wLhlDHZDThuliiXNgh5aAICAbyKV0p8AGNA1ry2zAkLjw%2FLhALpxL6mJIhsRQ3HMa79TLPRvUsjKOUzYYyrVvp8AGVGlqu3QwZAgsnh0dDKtbhH86IAOHgQtb8oOoO%2FqyoENAhhhKQuiAEGh605YJYcSR%2F5d60rQu6HrSB3MntlaIASMCskCTaqDLbze%2FvtzcRPu5%2F3q4mf26vvwpcLq5j%2BsUuss%2BN64wkGxad2PkNl69oIyqqHINfF391YJ3TM%2FUAlgsAZ73hD2Rlbt0HdO%2BSUtzqEnPmbqht0Tg%2FQcEwS7uXqHZ331og3cr%2BJH5%2Bye61WfNiA%2Bv3zHDogPc94L28HY%2FsgfRZQY%2BTC8Lj3aMqMYI8d2tNwclZ2I9a4D7eMUNJToR1WhpK%2FGAbQbWK9gDVwPaM9JJkvkhjndEiRCqBVc0Zu%2B50kRStEbXWJvDoXUxzfC%2BX%2BWdWWFEdjPFtULZqK5Nq2iUvWtap%2BlhLkmsSulHJ424HbCq%2BunQdKcsnQCkPpbGm8fVx9LhpZeeZ%2B4yJ8RBoPTOD6ggy0tZmBz4Gf4R3b%2FeURRlm%2Bm78%2FaJqUOpPlYZdu4EK0x1tD1WUQ0Vb8%2BejRmNKBUDiz83N2A5IU847NgVYlTUN2DBYOnKF%2BJuyXi%2FX6LEeCKcY8H58J%2F9K5ryl2RDPXt%2FiT%2BpepRxkKt8ZUTxFC17UO6GWCyG6a7aSVWnbA8n0BoqSCqb7k%2BM1Fx%2FYqgTtTKkdiaaqxZSbn72aK2uJUu9dcfopOxY1Tk6dUqtqLQJUrzzTgPoJONT545OlT1Y2zU2yX6EQEbAv%2BZWGQ%2B6NkqF9WLNL6FX9j1GXyP5jKqoUEsGS0cKYk5oaNztyBgj5ODIONmW5PDQGMdDTmUyb0zyw7kPcZKGfcpDHDJEKlC109NOaOPOKYG2t2Aku1mpiY7HevZMb3fx1XTMJVjDWrl43PkBWGcUOunZuHBhveaL0MrwPYPjrSrRDxd%2B6ClRQh51vHnv0bayvHECK0D1OQNzd4n2vHSdzEtE9yfUQ5Q3aeLlrkwfKaIeg%2B1ix%2FhStTWDWDnXi1bex0ffQkZCohk6%2BmniukMtgrkzpO9DP91IOcv7VBEPjknVvr1Dp7SfiYL%2FzPzUBO%2FnmJdqyMOxcI0kfJa9A5oNfOv9fXjhaeaiwPdAM446v6%2BWnz%2FqH3n%2BgfcZ59%2BH8XxdqXdalIqEc1NNHdgp44B%2F62v7iBrQ5v2aYndq%2FZ9bmO6o%2BidaxIgcV7YrlDLI6LEfmMEWJSYEznYddiei%2FsCzl%2B8hlImvL%2F%2B%2BvJ1eTqY3pbLptGRyP5vdf7%2BBL6D0wp2Rbx8fn9Bhpavv7u8uqj3xHIXazP2YQS7iaYzJVq7SZvcHNXRjCqb2yTAO9%2FGLqt0WvEKrwhS%2BTu0tdRan0EmylFZltSoO9nSsy8hPk%2FTj9yrsDo6OOx%2BHNBtVcQzIGP%2FEdX8TqD3%2FrKPMJJGQArafQckTS%2BuNJIW1%2BxNKmthyS4m6%2Fpchv2jSAo5KL0rDQWOrfylpZnnKLsqwIJv39cCUPLLpxmSiJxZlwEnxmmDqWoaP46bS7doAjtzVsvZMEexMQcsq2i5TcL2HZQJySRSU7LFvrifGDpYMMBCOByjpBSUPtM4DtHyirfIAJZMgRzwwrG4Q3nmAkihws322LX8VjhI%2BvZrefGXiAQNsM9AL88wNDNAQjhtGkgrapwJqMtFWuWDEz06TGMHS8V%2BMyAH%2FDpje%2FctD5P6RoEyQ7YgZUCGcz8f5BaXPb9Pn0zLLtOvzFW58fpIhU%2Fr8ETmqu32c3AnZz6%2BOCuF8%2Fqg4V7D0%2BY35fNoO8%2B36%2FGKqPzefP5IbxiRiKDKgmwhSPyFFKs9engEHPHt5%2BpINsjPw3fV4UXIdJSvv52T9elXfXMtW0XRrkXFaSdLlSq4DEChpFCeh5KK%2F31nvE%2F0hi2jc8zb9u8n4XDpBz7mSq06ciMfrcoNo1uFcA0zRppKL%2Fn60Rf7nMbz7kDkMQWmCTCIYWEH4srzF9OqEhXisIDeKPgFWaFPXRX8%2FMg%2FS%2Bei6PmSQkZi8gFGVMTQcNMDmLImhFBfCEQN%2BpOSBFnmgVVEX3eznLPD9iEWimhSPCHAoO2PoOXzg0g2%2FXlJBMTLEo4JioaekgsaooE2tF93sZEo8nvx%2BX1C%2FT4aBF8Cfe9Ymyp%2BpfApzM4ns9wuQIZ7fJ4U%2FJ5p0KHpP1tSWpRPqB7MJRatFSZjUnhGKnq6UHMc%2FpOuzyti6J4RUY5TbfnLQp%2BRfpEo16kjNRjeZTLrThlRDL%2Bi2n4pUAyfoE0eqofMvsaR%2FNynKSdbQSr0GI1iE633pMvNOG8PwA3TRuV5DZ5DtcDAs1wt61dxzBSnLccy1lGuUo0I8UiBlPZIUWieFzuUaOoNqhwdSGApKCqQqZx5teSRJoRgVwpECnimSHNAiB3Qv1TDIPQE48vmGoLoMvLVW1ufDhwVSlnEAGOK5%2FQFh%2BDa3rOt9YE8QtfeBPUFqmdbDky8Hp%2FWGBfBqZ1rPIMd3V4kqq4zje0LM6uGeDg7OGVUn9RrbNpKyr5fsjNU%2FqWcU9PVPZVLPIEdqnE%2FqGYIuoKBsdIR1s3JOjxErwnXZ5L5LFdniuKH7AbbofE6Psu9Sxw6i0aH8QFD9B2XTJTmndxAVwpECZWuNy3hJphzx5UZ8Ot7D8%2BCIrzHnTdkCQ3J4%2FSO%2BojjMqYz4KBtkcD7iGwpK40OSxqMl83K8x4gU8ahdajjbGO8d4IrOx3tDsTScQ0E1nENSw%2FlieX5wJwd9h6AhHjMMJRG0TgSd6zaHxTso8OD3BZVpDsnJP9uUbr8CMoRz%2B5T9k050SX2i2UkOWtfsYG1FVrPDlKmnHc0O3j1J2rSCTXH09KBNixLxtWRTMrpHWjlMlLJnFOjc3d8g55kpzpoInSOnas1N%2BzL%2BYQ19boiTt5UVgEfontEz3zxzQ2Cnklc%2BkCyhn0uWYFCi7LQgu9FU9ZMhtzt%2Bq9%2FAsWQ8yYFzdHdW%2FWTYiuPq1%2FAEXFz9Bo7OdFb9ZLiI4%2Brvq%2FvoNwZ6x9VPhnG4rn593%2FfjW3RW%2FaQEmuPqzzufoaJ9poiaWzUAKWnm2AAjbR%2F%2Fut5134eMJnDc9TTweifs%2FZVhU9UPDz3XDbIDevhRq6%2FuAqAz%2Fg8%3D%3C%2Fdiagram%3E%3C%2Fmxfile%3E)  

## Authors

 ✍️ **api-team** members: 
* [Ivana Mihanović](https://github.com/imihanovic)
* [Anamarija Papić](https://github.com/anamarijapapic)
* [Petar Vidović](https://github.com/Petar1107)
