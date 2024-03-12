### Skift af database vha. application.properties
Man kan placere en application.properties fil under `src/test/resources`, som automatisk overrider den i `src/main/resources`. Her kan man f.eks. angive url til lokal testdatabase.
Se eksempel i testklassen: `DepartmentRepositoryTest`

### Active profiles
Projektet viser hvordan man kan bruge forskellige konfigurationer i forskellige tests på hhv. udviklings- og deploymentprocessen vha. Spring Profiles.
Baseret på https://www.baeldung.com/spring-boot-junit-5-testing-active-profile. Se eksempler i testklasserne, som hedder noget med `_ProfileUnitTest.

