/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.broadleafcommerce.openadmin.client.view.dynamic;

import com.smartgwt.client.widgets.form.fields.ComboBoxItem;
import com.smartgwt.client.widgets.grid.ColumnTree;
import com.smartgwt.client.widgets.toolbar.ToolStrip;
import com.smartgwt.client.widgets.toolbar.ToolStripButton;

/**
 * 
 * @author jfischer
 *
 */
public interface DynamicEntityColumnTreeDisplay {

	public abstract ToolStripButton getAddButton();

	public abstract ToolStripButton getRemoveButton();

	public abstract ComboBoxItem getEntityType();

	public abstract ColumnTree getGrid();
	
	public abstract ToolStrip getToolBar();

}