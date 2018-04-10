spring cloud 负载均衡策略： <br>

IRule <br>
    --- AbstractLoadBalancerRule <br>
        --- ClientConfigEnabledRoundRobinRule <br>
            --- BestAvailableRule <br>
            --- PredicateBasedRule <br>
                --- AvailabilityFilteringRule <br>
                --- ZoneAvoidanceRule <br>
        --- RandomRule <br>
        --- RetryRule <br>
        --- RoundRobinRule <br>
            --- WeightedResponseTimeRule <br>