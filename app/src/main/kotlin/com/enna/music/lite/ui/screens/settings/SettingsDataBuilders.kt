/*
 * 恩纳 (Enna) Project Original (2026)
 * Chartreux Westia (github.com/恩纳 (Enna))
 * Licensed Under GPL-3.0 | see git history for contributors
 * Don't remove this copyright holder!
 */


package com.enna.music.lite.ui.screens.settings

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.widget.Toast
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.enna.music.lite.BuildConfig
import com.enna.music.lite.R

@Composable
fun buildQuickActions(
    navController: NavController,
    resetSearch: () -> Unit,
): List<SettingsQuickAction> =
    listOf(
        SettingsQuickAction(
            icon = painterResource(R.drawable.palette),
            label = stringResource(R.string.appearance),
            onClick = { resetSearch(); navController.navigate("settings/appearance") },
            accentColor = MaterialTheme.colorScheme.primary,
        ),
        SettingsQuickAction(
            icon = painterResource(R.drawable.play),
            label = stringResource(R.string.player_and_audio),
            onClick = { resetSearch(); navController.navigate("settings/player") },
            accentColor = MaterialTheme.colorScheme.tertiary,
        ),
        SettingsQuickAction(
            icon = painterResource(R.drawable.storage),
            label = stringResource(R.string.storage),
            onClick = { resetSearch(); navController.navigate("settings/storage") },
            accentColor = MaterialTheme.colorScheme.secondary,
        ),
        SettingsQuickAction(
            icon = painterResource(R.drawable.security),
            label = stringResource(R.string.privacy),
            onClick = { resetSearch(); navController.navigate("settings/privacy") },
            accentColor = MaterialTheme.colorScheme.error,
        ),
    )

@Composable
fun buildIntegrationActions(
    navController: NavController,
    resetSearch: () -> Unit,
): List<SettingsIntegrationAction> =
    listOf()

@Composable
fun buildSettingsGroups(
    navController: NavController,
    isAndroid12OrLater: Boolean,
    hasUpdate: Boolean,
    context: Context,
    resetSearch: () -> Unit,
): List<SettingsGroup> =
    listOf()

@Composable
fun buildInternalItems(
    navController: NavController,
    resetSearch: () -> Unit,
): List<SettingsItem> =
    listOf()
