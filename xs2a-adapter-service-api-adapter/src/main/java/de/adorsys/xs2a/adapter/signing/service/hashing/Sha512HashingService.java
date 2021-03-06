package de.adorsys.xs2a.adapter.signing.service.hashing;

import de.adorsys.xs2a.adapter.signing.service.algorithm.HashingAlgorithm;

public class Sha512HashingService extends AbstractShaHashingService {

    @Override
    protected HashingAlgorithm getAlgorithm() {
        return HashingAlgorithm.SHA512;
    }
}
