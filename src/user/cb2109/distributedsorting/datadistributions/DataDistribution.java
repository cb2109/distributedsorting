package user.cb2109.distributedsorting.datadistributions;

import user.cb2109.distributedsorting.SortItem;

import java.util.Collection;

/**
 * Author: Christopher Bates
 * Date: 16/03/2018
 */
public interface DataDistribution<T extends SortItem> {

    Collection<DataSegment<T>> segmentDistribution(int numberOfSegments);
}
