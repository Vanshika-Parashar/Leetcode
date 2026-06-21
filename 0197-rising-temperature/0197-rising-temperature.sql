select today.id as Id  from Weather as today 
 where exists (
    select 1 from Weather as yesterday
    where yesterday.temperature < today.temperature
    and
    today.recordDate-yesterday.recordDate=1

);
-- //isme hme date consecutive honi chahiye means we have to check temp between ifeeb and 2 feb not2 feb given so cant check 1feb nd 3 feb
