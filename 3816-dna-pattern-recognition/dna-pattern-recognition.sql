# Write your MySQL query statement below
select sample_id, dna_sequence, species ,
dna_sequence like "ATG%" as has_start ,
dna_sequence like "%TAA" || dna_sequence like "%TAG" || dna_sequence like "%TGA" as has_stop ,
dna_sequence like "%ATAT%" as has_atat,
dna_sequence like "%GGG%" as has_ggg from samples 
order by sample_id asc;