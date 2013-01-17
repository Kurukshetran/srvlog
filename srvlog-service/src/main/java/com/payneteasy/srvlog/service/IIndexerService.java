package com.payneteasy.srvlog.service;

import java.util.Date;
import java.util.List;

/**
 * Date: 14.01.13 Time: 15:38
 */
public interface IIndexerService {

    List<Long> search(Date from, Date to, List<Integer> facilities, List<Integer> severities, List<Integer> hosts, String pattern, Integer offset, Integer limit) throws IndexerServiceException;
}