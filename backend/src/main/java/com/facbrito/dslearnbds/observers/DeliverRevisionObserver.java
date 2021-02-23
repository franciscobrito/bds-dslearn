package com.facbrito.dslearnbds.observers;

import com.facbrito.dslearnbds.entities.Deliver;

public interface DeliverRevisionObserver {

	void onSaveRevision(Deliver deliver);
}
