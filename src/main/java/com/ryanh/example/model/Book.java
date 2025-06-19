/*
 * Copyright 2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v1.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.ryanh.example.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public record Book(Long id, String title, String author) {}
