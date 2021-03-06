/**
 * Copyright (C) 2009 eXo Platform SAS.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.exoplatform.groovyscript;

import org.exoplatform.component.test.AbstractGateInTest;

import java.io.IOException;

/**
 * @author <a href="mailto:trong.tran@exoplatform.com">Trong Tran</a>
 * @version $Revision$
 */
public class TestGroovyTemplateEngine extends AbstractGateInTest
{
   public void testFileName() throws IOException, TemplateCompilationException
   {
      
      GroovyTemplateEngine engine_ = new GroovyTemplateEngine();
      try {
         GroovyTemplate template = engine_.createTemplate("/path/to/file-lt.gtmpl", "file-lt.gtmpl", "content of the file.gtmpl");
      } catch (GroovyCompilationException e) {
         fail("Creating GroovyTemplate is failed ");
      }
   }
}
