/*
 * Copyright 2020, Gerwin Klein <lsf@jflex.de>
 * SPDX-License-Identifier: BSD-3-Clause
 */

package de.jflex.testcase.eofclose;

%%

%public
%class EofClose
%int

%eofclose

%%

.+  { /* ignore */ }
\n  { /* that too */ }
