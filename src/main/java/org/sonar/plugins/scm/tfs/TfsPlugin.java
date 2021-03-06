/*
 * SonarQube :: Plugins :: SCM :: TFS
 * Copyright (C) 2014 SonarSource
 * dev@sonar.codehaus.org
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package org.sonar.plugins.scm.tfs;

import org.sonar.api.SonarPlugin;

import java.util.ArrayList;
import java.util.List;

public final class TfsPlugin extends SonarPlugin {

  @SuppressWarnings("unchecked")
  @Override
  public List getExtensions() {
    List result = new ArrayList();
    result.add(TfsScmProvider.class);
    result.add(TfsBlameCommand.class);
    result.add(TfsConfiguration.class);
    result.addAll(TfsConfiguration.getProperties());
    return result;
  }

}
